// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AddCasterLayoutResponseBody} extends {@link TeaModel}
 *
 * <p>AddCasterLayoutResponseBody</p>
 */
public class AddCasterLayoutResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LayoutId")
    private String layoutId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private AddCasterLayoutResponseBody(Builder builder) {
        this.layoutId = builder.layoutId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddCasterLayoutResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return layoutId
     */
    public String getLayoutId() {
        return this.layoutId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String layoutId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(AddCasterLayoutResponseBody model) {
            this.layoutId = model.layoutId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the layout.</p>
         * <p>Record the ID as it can be used to manage the layout being created.</p>
         * 
         * <strong>example:</strong>
         * <p>21926b36-7dd2-4fde-ae25-51b5bc8e****</p>
         */
        public Builder layoutId(String layoutId) {
            this.layoutId = layoutId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>16A96B9A-F203-4EC5-8E43-CB92E68F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AddCasterLayoutResponseBody build() {
            return new AddCasterLayoutResponseBody(this);
        } 

    } 

}

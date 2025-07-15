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
 * {@link AddStudioLayoutResponseBody} extends {@link TeaModel}
 *
 * <p>AddStudioLayoutResponseBody</p>
 */
public class AddStudioLayoutResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LayoutId")
    private String layoutId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private AddStudioLayoutResponseBody(Builder builder) {
        this.layoutId = builder.layoutId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddStudioLayoutResponseBody create() {
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

        private Builder(AddStudioLayoutResponseBody model) {
            this.layoutId = model.layoutId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the layout. You can use the ID as a request parameter in the following operations: DeleteStudioLayout, ModifyStudioLayout, and DescribeStudioLayouts.</p>
         * 
         * <strong>example:</strong>
         * <p>445409ec-7eaa-461d-8f29-4bec2eb9****</p>
         */
        public Builder layoutId(String layoutId) {
            this.layoutId = layoutId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5c6a2a0d-f228-4a64-af62-20e91b96****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AddStudioLayoutResponseBody build() {
            return new AddStudioLayoutResponseBody(this);
        } 

    } 

}

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
 * {@link DeleteCasterLayoutResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteCasterLayoutResponseBody</p>
 */
public class DeleteCasterLayoutResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CasterId")
    private String casterId;

    @com.aliyun.core.annotation.NameInMap("LayoutId")
    private String layoutId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DeleteCasterLayoutResponseBody(Builder builder) {
        this.casterId = builder.casterId;
        this.layoutId = builder.layoutId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteCasterLayoutResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return casterId
     */
    public String getCasterId() {
        return this.casterId;
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
        private String casterId; 
        private String layoutId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DeleteCasterLayoutResponseBody model) {
            this.casterId = model.casterId;
            this.layoutId = model.layoutId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the production studio. You can use the ID as a request parameter in the API operation that is used to modify a layout in the production studio, query layouts in the production studio, add a component in the production studio, or query components in the production studio.</p>
         * 
         * <strong>example:</strong>
         * <p>a2b8e671-2fe5-4642-a2ec-bf93880e****</p>
         */
        public Builder casterId(String casterId) {
            this.casterId = casterId;
            return this;
        }

        /**
         * <p>The ID of the layout. You can use the ID as a request parameter in the API operation that is used to query layouts in the production studio.</p>
         * 
         * <strong>example:</strong>
         * <p>21926b36-7dd2-4fde-ae25-51b5bc8e****</p>
         */
        public Builder layoutId(String layoutId) {
            this.layoutId = layoutId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>16A96B9A-F203-4EC5-8E43-CB92E68F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteCasterLayoutResponseBody build() {
            return new DeleteCasterLayoutResponseBody(this);
        } 

    } 

}

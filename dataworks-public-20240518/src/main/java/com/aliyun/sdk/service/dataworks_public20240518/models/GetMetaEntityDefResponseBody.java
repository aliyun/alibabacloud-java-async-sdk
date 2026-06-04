// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link GetMetaEntityDefResponseBody} extends {@link TeaModel}
 *
 * <p>GetMetaEntityDefResponseBody</p>
 */
public class GetMetaEntityDefResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MetaEntityDef")
    private MetaEntityDef metaEntityDef;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetMetaEntityDefResponseBody(Builder builder) {
        this.metaEntityDef = builder.metaEntityDef;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMetaEntityDefResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return metaEntityDef
     */
    public MetaEntityDef getMetaEntityDef() {
        return this.metaEntityDef;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private MetaEntityDef metaEntityDef; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetMetaEntityDefResponseBody model) {
            this.metaEntityDef = model.metaEntityDef;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * MetaEntityDef.
         */
        public Builder metaEntityDef(MetaEntityDef metaEntityDef) {
            this.metaEntityDef = metaEntityDef;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>C636A747-7E4E-594D-94CD-2B4F8A9A9A63</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetMetaEntityDefResponseBody build() {
            return new GetMetaEntityDefResponseBody(this);
        } 

    } 

}

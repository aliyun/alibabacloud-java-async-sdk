// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

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
 * {@link CreateMemoryResponseBody} extends {@link TeaModel}
 *
 * <p>CreateMemoryResponseBody</p>
 */
public class CreateMemoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private CreateMemoryResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMemoryResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateMemoryResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>0FB1162C-D50B-5DA7-AD04-3417ABBF133A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateMemoryResponseBody build() {
            return new CreateMemoryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateMemoryResponseBody} extends {@link TeaModel}
     *
     * <p>CreateMemoryResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cmsWorkspaceName")
        private String cmsWorkspaceName;

        private Data(Builder builder) {
            this.cmsWorkspaceName = builder.cmsWorkspaceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return cmsWorkspaceName
         */
        public String getCmsWorkspaceName() {
            return this.cmsWorkspaceName;
        }

        public static final class Builder {
            private String cmsWorkspaceName; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.cmsWorkspaceName = model.cmsWorkspaceName;
            } 

            /**
             * cmsWorkspaceName.
             */
            public Builder cmsWorkspaceName(String cmsWorkspaceName) {
                this.cmsWorkspaceName = cmsWorkspaceName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}

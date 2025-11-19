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
 * {@link GetMemoryResponseBody} extends {@link TeaModel}
 *
 * <p>GetMemoryResponseBody</p>
 */
public class GetMemoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetMemoryResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMemoryResponseBody create() {
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

        private Builder(GetMemoryResponseBody model) {
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
         * <p>5A362ADD-51FC-5F4A-B858-D77F6EFAE2E6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetMemoryResponseBody build() {
            return new GetMemoryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetMemoryResponseBody} extends {@link TeaModel}
     *
     * <p>GetMemoryResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cmsWorkspaceName")
        private String cmsWorkspaceName;

        @com.aliyun.core.annotation.NameInMap("createTime")
        private Integer createTime;

        @com.aliyun.core.annotation.NameInMap("longTtl")
        private Integer longTtl;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("shortTtl")
        private Integer shortTtl;

        @com.aliyun.core.annotation.NameInMap("strategy")
        private java.util.List<String> strategy;

        private Data(Builder builder) {
            this.cmsWorkspaceName = builder.cmsWorkspaceName;
            this.createTime = builder.createTime;
            this.longTtl = builder.longTtl;
            this.name = builder.name;
            this.shortTtl = builder.shortTtl;
            this.strategy = builder.strategy;
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

        /**
         * @return createTime
         */
        public Integer getCreateTime() {
            return this.createTime;
        }

        /**
         * @return longTtl
         */
        public Integer getLongTtl() {
            return this.longTtl;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return shortTtl
         */
        public Integer getShortTtl() {
            return this.shortTtl;
        }

        /**
         * @return strategy
         */
        public java.util.List<String> getStrategy() {
            return this.strategy;
        }

        public static final class Builder {
            private String cmsWorkspaceName; 
            private Integer createTime; 
            private Integer longTtl; 
            private String name; 
            private Integer shortTtl; 
            private java.util.List<String> strategy; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.cmsWorkspaceName = model.cmsWorkspaceName;
                this.createTime = model.createTime;
                this.longTtl = model.longTtl;
                this.name = model.name;
                this.shortTtl = model.shortTtl;
                this.strategy = model.strategy;
            } 

            /**
             * cmsWorkspaceName.
             */
            public Builder cmsWorkspaceName(String cmsWorkspaceName) {
                this.cmsWorkspaceName = cmsWorkspaceName;
                return this;
            }

            /**
             * createTime.
             */
            public Builder createTime(Integer createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * longTtl.
             */
            public Builder longTtl(Integer longTtl) {
                this.longTtl = longTtl;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * shortTtl.
             */
            public Builder shortTtl(Integer shortTtl) {
                this.shortTtl = shortTtl;
                return this;
            }

            /**
             * strategy.
             */
            public Builder strategy(java.util.List<String> strategy) {
                this.strategy = strategy;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}

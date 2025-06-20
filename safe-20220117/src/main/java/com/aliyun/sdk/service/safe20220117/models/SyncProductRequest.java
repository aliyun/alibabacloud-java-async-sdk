// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.safe20220117.models;

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
 * {@link SyncProductRequest} extends {@link RequestModel}
 *
 * <p>SyncProductRequest</p>
 */
public class SyncProductRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AuthKey")
    private String authKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AuthSign")
    private String authSign;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ReqTimestamp")
    private Long reqTimestamp;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SyncProductList")
    private java.util.List<SyncProductList> syncProductList;

    private SyncProductRequest(Builder builder) {
        super(builder);
        this.authKey = builder.authKey;
        this.authSign = builder.authSign;
        this.reqTimestamp = builder.reqTimestamp;
        this.syncProductList = builder.syncProductList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SyncProductRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authKey
     */
    public String getAuthKey() {
        return this.authKey;
    }

    /**
     * @return authSign
     */
    public String getAuthSign() {
        return this.authSign;
    }

    /**
     * @return reqTimestamp
     */
    public Long getReqTimestamp() {
        return this.reqTimestamp;
    }

    /**
     * @return syncProductList
     */
    public java.util.List<SyncProductList> getSyncProductList() {
        return this.syncProductList;
    }

    public static final class Builder extends Request.Builder<SyncProductRequest, Builder> {
        private String authKey; 
        private String authSign; 
        private Long reqTimestamp; 
        private java.util.List<SyncProductList> syncProductList; 

        private Builder() {
            super();
        } 

        private Builder(SyncProductRequest request) {
            super(request);
            this.authKey = request.authKey;
            this.authSign = request.authSign;
            this.reqTimestamp = request.reqTimestamp;
            this.syncProductList = request.syncProductList;
        } 

        /**
         * AuthKey.
         */
        public Builder authKey(String authKey) {
            this.putBodyParameter("AuthKey", authKey);
            this.authKey = authKey;
            return this;
        }

        /**
         * AuthSign.
         */
        public Builder authSign(String authSign) {
            this.putBodyParameter("AuthSign", authSign);
            this.authSign = authSign;
            return this;
        }

        /**
         * ReqTimestamp.
         */
        public Builder reqTimestamp(Long reqTimestamp) {
            this.putBodyParameter("ReqTimestamp", reqTimestamp);
            this.reqTimestamp = reqTimestamp;
            return this;
        }

        /**
         * SyncProductList.
         */
        public Builder syncProductList(java.util.List<SyncProductList> syncProductList) {
            this.putBodyParameter("SyncProductList", syncProductList);
            this.syncProductList = syncProductList;
            return this;
        }

        @Override
        public SyncProductRequest build() {
            return new SyncProductRequest(this);
        } 

    } 

    /**
     * 
     * {@link SyncProductRequest} extends {@link TeaModel}
     *
     * <p>SyncProductRequest</p>
     */
    public static class InnerProductList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private InnerProductList(Builder builder) {
            this.code = builder.code;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InnerProductList create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String code; 
            private String name; 

            private Builder() {
            } 

            private Builder(InnerProductList model) {
                this.code = model.code;
                this.name = model.name;
            } 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public InnerProductList build() {
                return new InnerProductList(this);
            } 

        } 

    }
    /**
     * 
     * {@link SyncProductRequest} extends {@link TeaModel}
     *
     * <p>SyncProductRequest</p>
     */
    public static class SyncProductList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("InnerProductList")
        private java.util.List<InnerProductList> innerProductList;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private SyncProductList(Builder builder) {
            this.code = builder.code;
            this.innerProductList = builder.innerProductList;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SyncProductList create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return innerProductList
         */
        public java.util.List<InnerProductList> getInnerProductList() {
            return this.innerProductList;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String code; 
            private java.util.List<InnerProductList> innerProductList; 
            private String name; 

            private Builder() {
            } 

            private Builder(SyncProductList model) {
                this.code = model.code;
                this.innerProductList = model.innerProductList;
                this.name = model.name;
            } 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * InnerProductList.
             */
            public Builder innerProductList(java.util.List<InnerProductList> innerProductList) {
                this.innerProductList = innerProductList;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public SyncProductList build() {
                return new SyncProductList(this);
            } 

        } 

    }
}

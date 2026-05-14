// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

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
 * {@link ClinkCreateEnterprisePauseResponseBody} extends {@link TeaModel}
 *
 * <p>ClinkCreateEnterprisePauseResponseBody</p>
 */
public class ClinkCreateEnterprisePauseResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ClinkCreateEnterprisePauseResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ClinkCreateEnterprisePauseResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
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
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ClinkCreateEnterprisePauseResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ClinkCreateEnterprisePauseResponseBody build() {
            return new ClinkCreateEnterprisePauseResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ClinkCreateEnterprisePauseResponseBody} extends {@link TeaModel}
     *
     * <p>ClinkCreateEnterprisePauseResponseBody</p>
     */
    public static class EnterprisePause extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IsDefault")
        private Long isDefault;

        @com.aliyun.core.annotation.NameInMap("IsRest")
        private String isRest;

        @com.aliyun.core.annotation.NameInMap("PauseStatus")
        private String pauseStatus;

        private EnterprisePause(Builder builder) {
            this.isDefault = builder.isDefault;
            this.isRest = builder.isRest;
            this.pauseStatus = builder.pauseStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EnterprisePause create() {
            return builder().build();
        }

        /**
         * @return isDefault
         */
        public Long getIsDefault() {
            return this.isDefault;
        }

        /**
         * @return isRest
         */
        public String getIsRest() {
            return this.isRest;
        }

        /**
         * @return pauseStatus
         */
        public String getPauseStatus() {
            return this.pauseStatus;
        }

        public static final class Builder {
            private Long isDefault; 
            private String isRest; 
            private String pauseStatus; 

            private Builder() {
            } 

            private Builder(EnterprisePause model) {
                this.isDefault = model.isDefault;
                this.isRest = model.isRest;
                this.pauseStatus = model.pauseStatus;
            } 

            /**
             * <p>默认状态，0：不是；1：是</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder isDefault(Long isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * <p>休息状态，0：不是；1：是</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder isRest(String isRest) {
                this.isRest = isRest;
                return this;
            }

            /**
             * <p>置忙状态描述（不超4个字符）</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder pauseStatus(String pauseStatus) {
                this.pauseStatus = pauseStatus;
                return this;
            }

            public EnterprisePause build() {
                return new EnterprisePause(this);
            } 

        } 

    }
    /**
     * 
     * {@link ClinkCreateEnterprisePauseResponseBody} extends {@link TeaModel}
     *
     * <p>ClinkCreateEnterprisePauseResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClinkRequestId")
        private String clinkRequestId;

        @com.aliyun.core.annotation.NameInMap("EnterprisePause")
        private EnterprisePause enterprisePause;

        private Data(Builder builder) {
            this.clinkRequestId = builder.clinkRequestId;
            this.enterprisePause = builder.enterprisePause;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return clinkRequestId
         */
        public String getClinkRequestId() {
            return this.clinkRequestId;
        }

        /**
         * @return enterprisePause
         */
        public EnterprisePause getEnterprisePause() {
            return this.enterprisePause;
        }

        public static final class Builder {
            private String clinkRequestId; 
            private EnterprisePause enterprisePause; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.clinkRequestId = model.clinkRequestId;
                this.enterprisePause = model.enterprisePause;
            } 

            /**
             * <p>请求标识</p>
             * 
             * <strong>example:</strong>
             * <p>示例值</p>
             */
            public Builder clinkRequestId(String clinkRequestId) {
                this.clinkRequestId = clinkRequestId;
                return this;
            }

            /**
             * <p>企业置忙状态</p>
             */
            public Builder enterprisePause(EnterprisePause enterprisePause) {
                this.enterprisePause = enterprisePause;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}

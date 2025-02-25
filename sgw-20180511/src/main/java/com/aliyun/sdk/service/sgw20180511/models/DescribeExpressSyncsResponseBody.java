// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeExpressSyncsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeExpressSyncsResponseBody</p>
 */
public class DescribeExpressSyncsResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("ExpressSyncs")
    private ExpressSyncs expressSyncs;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private DescribeExpressSyncsResponseBody(Builder builder) {
        this.code = builder.code;
        this.expressSyncs = builder.expressSyncs;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeExpressSyncsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return expressSyncs
     */
    public ExpressSyncs getExpressSyncs() {
        return this.expressSyncs;
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private ExpressSyncs expressSyncs; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * ExpressSyncs.
         */
        public Builder expressSyncs(ExpressSyncs expressSyncs) {
            this.expressSyncs = expressSyncs;
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

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeExpressSyncsResponseBody build() {
            return new DescribeExpressSyncsResponseBody(this);
        } 

    } 

    public static class ExpressSync extends TeaModel {
        @NameInMap("BucketName")
        private String bucketName;

        @NameInMap("BucketPrefix")
        private String bucketPrefix;

        @NameInMap("BucketRegion")
        private String bucketRegion;

        @NameInMap("Description")
        private String description;

        @NameInMap("ExpressSyncId")
        private String expressSyncId;

        @NameInMap("MnsTopic")
        private String mnsTopic;

        @NameInMap("Name")
        private String name;

        private ExpressSync(Builder builder) {
            this.bucketName = builder.bucketName;
            this.bucketPrefix = builder.bucketPrefix;
            this.bucketRegion = builder.bucketRegion;
            this.description = builder.description;
            this.expressSyncId = builder.expressSyncId;
            this.mnsTopic = builder.mnsTopic;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExpressSync create() {
            return builder().build();
        }

        /**
         * @return bucketName
         */
        public String getBucketName() {
            return this.bucketName;
        }

        /**
         * @return bucketPrefix
         */
        public String getBucketPrefix() {
            return this.bucketPrefix;
        }

        /**
         * @return bucketRegion
         */
        public String getBucketRegion() {
            return this.bucketRegion;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return expressSyncId
         */
        public String getExpressSyncId() {
            return this.expressSyncId;
        }

        /**
         * @return mnsTopic
         */
        public String getMnsTopic() {
            return this.mnsTopic;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String bucketName; 
            private String bucketPrefix; 
            private String bucketRegion; 
            private String description; 
            private String expressSyncId; 
            private String mnsTopic; 
            private String name; 

            /**
             * BucketName.
             */
            public Builder bucketName(String bucketName) {
                this.bucketName = bucketName;
                return this;
            }

            /**
             * BucketPrefix.
             */
            public Builder bucketPrefix(String bucketPrefix) {
                this.bucketPrefix = bucketPrefix;
                return this;
            }

            /**
             * BucketRegion.
             */
            public Builder bucketRegion(String bucketRegion) {
                this.bucketRegion = bucketRegion;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * ExpressSyncId.
             */
            public Builder expressSyncId(String expressSyncId) {
                this.expressSyncId = expressSyncId;
                return this;
            }

            /**
             * MnsTopic.
             */
            public Builder mnsTopic(String mnsTopic) {
                this.mnsTopic = mnsTopic;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public ExpressSync build() {
                return new ExpressSync(this);
            } 

        } 

    }
    public static class ExpressSyncs extends TeaModel {
        @NameInMap("ExpressSync")
        private java.util.List < ExpressSync> expressSync;

        private ExpressSyncs(Builder builder) {
            this.expressSync = builder.expressSync;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExpressSyncs create() {
            return builder().build();
        }

        /**
         * @return expressSync
         */
        public java.util.List < ExpressSync> getExpressSync() {
            return this.expressSync;
        }

        public static final class Builder {
            private java.util.List < ExpressSync> expressSync; 

            /**
             * ExpressSync.
             */
            public Builder expressSync(java.util.List < ExpressSync> expressSync) {
                this.expressSync = expressSync;
                return this;
            }

            public ExpressSyncs build() {
                return new ExpressSyncs(this);
            } 

        } 

    }
}

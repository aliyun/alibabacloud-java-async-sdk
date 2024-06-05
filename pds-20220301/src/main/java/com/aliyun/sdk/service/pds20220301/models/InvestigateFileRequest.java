// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InvestigateFileRequest} extends {@link RequestModel}
 *
 * <p>InvestigateFileRequest</p>
 */
public class InvestigateFileRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("domain_id")
    private String domainId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("drive_file_ids")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < DriveFileIds> driveFileIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("policy")
    private Policy policy;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("recursive")
    private Boolean recursive;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("user_data")
    private String userData;

    private InvestigateFileRequest(Builder builder) {
        super(builder);
        this.domainId = builder.domainId;
        this.driveFileIds = builder.driveFileIds;
        this.policy = builder.policy;
        this.recursive = builder.recursive;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InvestigateFileRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainId
     */
    public String getDomainId() {
        return this.domainId;
    }

    /**
     * @return driveFileIds
     */
    public java.util.List < DriveFileIds> getDriveFileIds() {
        return this.driveFileIds;
    }

    /**
     * @return policy
     */
    public Policy getPolicy() {
        return this.policy;
    }

    /**
     * @return recursive
     */
    public Boolean getRecursive() {
        return this.recursive;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    public static final class Builder extends Request.Builder<InvestigateFileRequest, Builder> {
        private String domainId; 
        private java.util.List < DriveFileIds> driveFileIds; 
        private Policy policy; 
        private Boolean recursive; 
        private String userData; 

        private Builder() {
            super();
        } 

        private Builder(InvestigateFileRequest request) {
            super(request);
            this.domainId = request.domainId;
            this.driveFileIds = request.driveFileIds;
            this.policy = request.policy;
            this.recursive = request.recursive;
            this.userData = request.userData;
        } 

        /**
         * domain_id.
         */
        public Builder domainId(String domainId) {
            this.putHostParameter("domain_id", domainId);
            this.domainId = domainId;
            return this;
        }

        /**
         * drive_file_ids.
         */
        public Builder driveFileIds(java.util.List < DriveFileIds> driveFileIds) {
            this.putBodyParameter("drive_file_ids", driveFileIds);
            this.driveFileIds = driveFileIds;
            return this;
        }

        /**
         * policy.
         */
        public Builder policy(Policy policy) {
            this.putBodyParameter("policy", policy);
            this.policy = policy;
            return this;
        }

        /**
         * recursive.
         */
        public Builder recursive(Boolean recursive) {
            this.putBodyParameter("recursive", recursive);
            this.recursive = recursive;
            return this;
        }

        /**
         * user_data.
         */
        public Builder userData(String userData) {
            this.putBodyParameter("user_data", userData);
            this.userData = userData;
            return this;
        }

        @Override
        public InvestigateFileRequest build() {
            return new InvestigateFileRequest(this);
        } 

    } 

    public static class DriveFileIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("drive_id")
        @com.aliyun.core.annotation.Validation(required = true)
        private String driveId;

        @com.aliyun.core.annotation.NameInMap("file_id")
        @com.aliyun.core.annotation.Validation(required = true)
        private String fileId;

        private DriveFileIds(Builder builder) {
            this.driveId = builder.driveId;
            this.fileId = builder.fileId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DriveFileIds create() {
            return builder().build();
        }

        /**
         * @return driveId
         */
        public String getDriveId() {
            return this.driveId;
        }

        /**
         * @return fileId
         */
        public String getFileId() {
            return this.fileId;
        }

        public static final class Builder {
            private String driveId; 
            private String fileId; 

            /**
             * drive_id.
             */
            public Builder driveId(String driveId) {
                this.driveId = driveId;
                return this;
            }

            /**
             * file_id.
             */
            public Builder fileId(String fileId) {
                this.fileId = fileId;
                return this;
            }

            public DriveFileIds build() {
                return new DriveFileIds(this);
            } 

        } 

    }
    public static class Policy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("first_product_name")
        private String firstProductName;

        @com.aliyun.core.annotation.NameInMap("mtee_code")
        private String mteeCode;

        @com.aliyun.core.annotation.NameInMap("provider")
        private String provider;

        private Policy(Builder builder) {
            this.firstProductName = builder.firstProductName;
            this.mteeCode = builder.mteeCode;
            this.provider = builder.provider;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Policy create() {
            return builder().build();
        }

        /**
         * @return firstProductName
         */
        public String getFirstProductName() {
            return this.firstProductName;
        }

        /**
         * @return mteeCode
         */
        public String getMteeCode() {
            return this.mteeCode;
        }

        /**
         * @return provider
         */
        public String getProvider() {
            return this.provider;
        }

        public static final class Builder {
            private String firstProductName; 
            private String mteeCode; 
            private String provider; 

            /**
             * first_product_name.
             */
            public Builder firstProductName(String firstProductName) {
                this.firstProductName = firstProductName;
                return this;
            }

            /**
             * mtee_code.
             */
            public Builder mteeCode(String mteeCode) {
                this.mteeCode = mteeCode;
                return this;
            }

            /**
             * provider.
             */
            public Builder provider(String provider) {
                this.provider = provider;
                return this;
            }

            public Policy build() {
                return new Policy(this);
            } 

        } 

    }
}

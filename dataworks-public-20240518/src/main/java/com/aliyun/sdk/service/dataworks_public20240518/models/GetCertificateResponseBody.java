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
 * {@link GetCertificateResponseBody} extends {@link TeaModel}
 *
 * <p>GetCertificateResponseBody</p>
 */
public class GetCertificateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Certificate")
    private Certificate certificate;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetCertificateResponseBody(Builder builder) {
        this.certificate = builder.certificate;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCertificateResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return certificate
     */
    public Certificate getCertificate() {
        return this.certificate;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Certificate certificate; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetCertificateResponseBody model) {
            this.certificate = model.certificate;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The details of the certificate file.</p>
         */
        public Builder certificate(Certificate certificate) {
            this.certificate = certificate;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0000-ABCD-EFG****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetCertificateResponseBody build() {
            return new GetCertificateResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetCertificateResponseBody} extends {@link TeaModel}
     *
     * <p>GetCertificateResponseBody</p>
     */
    public static class Certificate extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("CreateUser")
        private String createUser;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("FileSizeInBytes")
        private Long fileSizeInBytes;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        private Certificate(Builder builder) {
            this.createTime = builder.createTime;
            this.createUser = builder.createUser;
            this.description = builder.description;
            this.fileSizeInBytes = builder.fileSizeInBytes;
            this.id = builder.id;
            this.name = builder.name;
            this.projectId = builder.projectId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Certificate create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return createUser
         */
        public String getCreateUser() {
            return this.createUser;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return fileSizeInBytes
         */
        public Long getFileSizeInBytes() {
            return this.fileSizeInBytes;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        public static final class Builder {
            private Long createTime; 
            private String createUser; 
            private String description; 
            private Long fileSizeInBytes; 
            private Long id; 
            private String name; 
            private Long projectId; 

            private Builder() {
            } 

            private Builder(Certificate model) {
                this.createTime = model.createTime;
                this.createUser = model.createUser;
                this.description = model.description;
                this.fileSizeInBytes = model.fileSizeInBytes;
                this.id = model.id;
                this.name = model.name;
                this.projectId = model.projectId;
            } 

            /**
             * <p>The time when the certificate file was created. The value is a UNIX timestamp. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1730217600000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The ID of the user who created the certificate file.</p>
             * 
             * <strong>example:</strong>
             * <p>1107550004253538</p>
             */
            public Builder createUser(String createUser) {
                this.createUser = createUser;
                return this;
            }

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>This is a file</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The size of the certificate file, in bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>77549</p>
             */
            public Builder fileSizeInBytes(Long fileSizeInBytes) {
                this.fileSizeInBytes = fileSizeInBytes;
                return this;
            }

            /**
             * <p>The ID of the certificate file.</p>
             * 
             * <strong>example:</strong>
             * <p>676303114031776</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the certificate file.</p>
             * 
             * <strong>example:</strong>
             * <p>ca1.crt</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The ID of the workspace to which the certificate file belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>177161</p>
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            public Certificate build() {
                return new Certificate(this);
            } 

        } 

    }
}

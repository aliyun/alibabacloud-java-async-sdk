// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20230522.models;

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
 * {@link AttachWhitelistTemplateToInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>AttachWhitelistTemplateToInstanceResponseBody</p>
 */
public class AttachWhitelistTemplateToInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private AttachWhitelistTemplateToInstanceResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AttachWhitelistTemplateToInstanceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(AttachWhitelistTemplateToInstanceResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AttachWhitelistTemplateToInstanceResponseBody build() {
            return new AttachWhitelistTemplateToInstanceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link AttachWhitelistTemplateToInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>AttachWhitelistTemplateToInstanceResponseBody</p>
     */
    public static class AttachFailList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBInstanceId")
        private String DBInstanceId;

        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        private AttachFailList(Builder builder) {
            this.DBInstanceId = builder.DBInstanceId;
            this.reason = builder.reason;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AttachFailList create() {
            return builder().build();
        }

        /**
         * @return DBInstanceId
         */
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        public static final class Builder {
            private String DBInstanceId; 
            private String reason; 

            private Builder() {
            } 

            private Builder(AttachFailList model) {
                this.DBInstanceId = model.DBInstanceId;
                this.reason = model.reason;
            } 

            /**
             * DBInstanceId.
             */
            public Builder DBInstanceId(String DBInstanceId) {
                this.DBInstanceId = DBInstanceId;
                return this;
            }

            /**
             * Reason.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            public AttachFailList build() {
                return new AttachFailList(this);
            } 

        } 

    }
    /**
     * 
     * {@link AttachWhitelistTemplateToInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>AttachWhitelistTemplateToInstanceResponseBody</p>
     */
    public static class DbInstances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBInstanceId")
        private String DBInstanceId;

        private DbInstances(Builder builder) {
            this.DBInstanceId = builder.DBInstanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DbInstances create() {
            return builder().build();
        }

        /**
         * @return DBInstanceId
         */
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public static final class Builder {
            private String DBInstanceId; 

            private Builder() {
            } 

            private Builder(DbInstances model) {
                this.DBInstanceId = model.DBInstanceId;
            } 

            /**
             * DBInstanceId.
             */
            public Builder DBInstanceId(String DBInstanceId) {
                this.DBInstanceId = DBInstanceId;
                return this;
            }

            public DbInstances build() {
                return new DbInstances(this);
            } 

        } 

    }
    /**
     * 
     * {@link AttachWhitelistTemplateToInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>AttachWhitelistTemplateToInstanceResponseBody</p>
     */
    public static class Templates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DbInstances")
        private java.util.List<DbInstances> dbInstances;

        @com.aliyun.core.annotation.NameInMap("SecurityIPList")
        private String securityIPList;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private String templateId;

        @com.aliyun.core.annotation.NameInMap("TemplateName")
        private String templateName;

        private Templates(Builder builder) {
            this.dbInstances = builder.dbInstances;
            this.securityIPList = builder.securityIPList;
            this.templateId = builder.templateId;
            this.templateName = builder.templateName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Templates create() {
            return builder().build();
        }

        /**
         * @return dbInstances
         */
        public java.util.List<DbInstances> getDbInstances() {
            return this.dbInstances;
        }

        /**
         * @return securityIPList
         */
        public String getSecurityIPList() {
            return this.securityIPList;
        }

        /**
         * @return templateId
         */
        public String getTemplateId() {
            return this.templateId;
        }

        /**
         * @return templateName
         */
        public String getTemplateName() {
            return this.templateName;
        }

        public static final class Builder {
            private java.util.List<DbInstances> dbInstances; 
            private String securityIPList; 
            private String templateId; 
            private String templateName; 

            private Builder() {
            } 

            private Builder(Templates model) {
                this.dbInstances = model.dbInstances;
                this.securityIPList = model.securityIPList;
                this.templateId = model.templateId;
                this.templateName = model.templateName;
            } 

            /**
             * DbInstances.
             */
            public Builder dbInstances(java.util.List<DbInstances> dbInstances) {
                this.dbInstances = dbInstances;
                return this;
            }

            /**
             * SecurityIPList.
             */
            public Builder securityIPList(String securityIPList) {
                this.securityIPList = securityIPList;
                return this;
            }

            /**
             * TemplateId.
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * TemplateName.
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            public Templates build() {
                return new Templates(this);
            } 

        } 

    }
    /**
     * 
     * {@link AttachWhitelistTemplateToInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>AttachWhitelistTemplateToInstanceResponseBody</p>
     */
    public static class AttachSuccessedList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBInstanceId")
        private String DBInstanceId;

        @com.aliyun.core.annotation.NameInMap("Templates")
        private java.util.List<Templates> templates;

        private AttachSuccessedList(Builder builder) {
            this.DBInstanceId = builder.DBInstanceId;
            this.templates = builder.templates;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AttachSuccessedList create() {
            return builder().build();
        }

        /**
         * @return DBInstanceId
         */
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        /**
         * @return templates
         */
        public java.util.List<Templates> getTemplates() {
            return this.templates;
        }

        public static final class Builder {
            private String DBInstanceId; 
            private java.util.List<Templates> templates; 

            private Builder() {
            } 

            private Builder(AttachSuccessedList model) {
                this.DBInstanceId = model.DBInstanceId;
                this.templates = model.templates;
            } 

            /**
             * DBInstanceId.
             */
            public Builder DBInstanceId(String DBInstanceId) {
                this.DBInstanceId = DBInstanceId;
                return this;
            }

            /**
             * Templates.
             */
            public Builder templates(java.util.List<Templates> templates) {
                this.templates = templates;
                return this;
            }

            public AttachSuccessedList build() {
                return new AttachSuccessedList(this);
            } 

        } 

    }
    /**
     * 
     * {@link AttachWhitelistTemplateToInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>AttachWhitelistTemplateToInstanceResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AttachFailList")
        private java.util.List<AttachFailList> attachFailList;

        @com.aliyun.core.annotation.NameInMap("AttachSuccessedList")
        private java.util.List<AttachSuccessedList> attachSuccessedList;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Data(Builder builder) {
            this.attachFailList = builder.attachFailList;
            this.attachSuccessedList = builder.attachSuccessedList;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return attachFailList
         */
        public java.util.List<AttachFailList> getAttachFailList() {
            return this.attachFailList;
        }

        /**
         * @return attachSuccessedList
         */
        public java.util.List<AttachSuccessedList> getAttachSuccessedList() {
            return this.attachSuccessedList;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private java.util.List<AttachFailList> attachFailList; 
            private java.util.List<AttachSuccessedList> attachSuccessedList; 
            private String status; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.attachFailList = model.attachFailList;
                this.attachSuccessedList = model.attachSuccessedList;
                this.status = model.status;
            } 

            /**
             * AttachFailList.
             */
            public Builder attachFailList(java.util.List<AttachFailList> attachFailList) {
                this.attachFailList = attachFailList;
                return this;
            }

            /**
             * AttachSuccessedList.
             */
            public Builder attachSuccessedList(java.util.List<AttachSuccessedList> attachSuccessedList) {
                this.attachSuccessedList = attachSuccessedList;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}

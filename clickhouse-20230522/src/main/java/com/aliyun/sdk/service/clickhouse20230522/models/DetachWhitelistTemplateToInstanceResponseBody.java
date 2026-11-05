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
 * {@link DetachWhitelistTemplateToInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>DetachWhitelistTemplateToInstanceResponseBody</p>
 */
public class DetachWhitelistTemplateToInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DetachWhitelistTemplateToInstanceResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetachWhitelistTemplateToInstanceResponseBody create() {
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

        private Builder(DetachWhitelistTemplateToInstanceResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DetachWhitelistTemplateToInstanceResponseBody build() {
            return new DetachWhitelistTemplateToInstanceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DetachWhitelistTemplateToInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>DetachWhitelistTemplateToInstanceResponseBody</p>
     */
    public static class DetachFailList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBInstanceId")
        private String DBInstanceId;

        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        private DetachFailList(Builder builder) {
            this.DBInstanceId = builder.DBInstanceId;
            this.reason = builder.reason;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DetachFailList create() {
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

            private Builder(DetachFailList model) {
                this.DBInstanceId = model.DBInstanceId;
                this.reason = model.reason;
            } 

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>my-database</p>
             */
            public Builder DBInstanceId(String DBInstanceId) {
                this.DBInstanceId = DBInstanceId;
                return this;
            }

            /**
             * <p>The reason the detach operation failed.</p>
             * 
             * <strong>example:</strong>
             * <p>处理异常</p>
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            public DetachFailList build() {
                return new DetachFailList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DetachWhitelistTemplateToInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>DetachWhitelistTemplateToInstanceResponseBody</p>
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
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>asdfwef</p>
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
     * {@link DetachWhitelistTemplateToInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>DetachWhitelistTemplateToInstanceResponseBody</p>
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
             * <p>A list of associated instances.</p>
             */
            public Builder dbInstances(java.util.List<DbInstances> dbInstances) {
                this.dbInstances = dbInstances;
                return this;
            }

            /**
             * <p>The IP whitelist.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.1.1,10.0.0.1</p>
             */
            public Builder securityIPList(String securityIPList) {
                this.securityIPList = securityIPList;
                return this;
            }

            /**
             * <p>The whitelist template ID.</p>
             * 
             * <strong>example:</strong>
             * <p>g-asdfwem</p>
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * <p>The whitelist template name.</p>
             * 
             * <strong>example:</strong>
             * <p>demo_template</p>
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
     * {@link DetachWhitelistTemplateToInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>DetachWhitelistTemplateToInstanceResponseBody</p>
     */
    public static class DetachSuccessedList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBInstanceId")
        private String DBInstanceId;

        @com.aliyun.core.annotation.NameInMap("Templates")
        private java.util.List<Templates> templates;

        private DetachSuccessedList(Builder builder) {
            this.DBInstanceId = builder.DBInstanceId;
            this.templates = builder.templates;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DetachSuccessedList create() {
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

            private Builder(DetachSuccessedList model) {
                this.DBInstanceId = model.DBInstanceId;
                this.templates = model.templates;
            } 

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>my-database</p>
             */
            public Builder DBInstanceId(String DBInstanceId) {
                this.DBInstanceId = DBInstanceId;
                return this;
            }

            /**
             * <p>A list of whitelist templates.</p>
             */
            public Builder templates(java.util.List<Templates> templates) {
                this.templates = templates;
                return this;
            }

            public DetachSuccessedList build() {
                return new DetachSuccessedList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DetachWhitelistTemplateToInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>DetachWhitelistTemplateToInstanceResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DetachFailList")
        private java.util.List<DetachFailList> detachFailList;

        @com.aliyun.core.annotation.NameInMap("DetachSuccessedList")
        private java.util.List<DetachSuccessedList> detachSuccessedList;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Data(Builder builder) {
            this.detachFailList = builder.detachFailList;
            this.detachSuccessedList = builder.detachSuccessedList;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return detachFailList
         */
        public java.util.List<DetachFailList> getDetachFailList() {
            return this.detachFailList;
        }

        /**
         * @return detachSuccessedList
         */
        public java.util.List<DetachSuccessedList> getDetachSuccessedList() {
            return this.detachSuccessedList;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private java.util.List<DetachFailList> detachFailList; 
            private java.util.List<DetachSuccessedList> detachSuccessedList; 
            private String status; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.detachFailList = model.detachFailList;
                this.detachSuccessedList = model.detachSuccessedList;
                this.status = model.status;
            } 

            /**
             * <p>A list of instances that failed to detach.</p>
             */
            public Builder detachFailList(java.util.List<DetachFailList> detachFailList) {
                this.detachFailList = detachFailList;
                return this;
            }

            /**
             * <p>A list of successfully detached instances.</p>
             */
            public Builder detachSuccessedList(java.util.List<DetachSuccessedList> detachSuccessedList) {
                this.detachSuccessedList = detachSuccessedList;
                return this;
            }

            /**
             * <p>The status of the operation. A value of <code>ok</code> indicates success.</p>
             * 
             * <strong>example:</strong>
             * <p>ok</p>
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

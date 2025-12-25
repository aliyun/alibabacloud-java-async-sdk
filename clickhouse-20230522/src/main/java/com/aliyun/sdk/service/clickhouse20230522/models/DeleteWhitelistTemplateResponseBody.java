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
 * {@link DeleteWhitelistTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteWhitelistTemplateResponseBody</p>
 */
public class DeleteWhitelistTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DeleteWhitelistTemplateResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteWhitelistTemplateResponseBody create() {
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

        private Builder(DeleteWhitelistTemplateResponseBody model) {
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteWhitelistTemplateResponseBody build() {
            return new DeleteWhitelistTemplateResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DeleteWhitelistTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>DeleteWhitelistTemplateResponseBody</p>
     */
    public static class DbInstances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DbInstanceName")
        private String dbInstanceName;

        private DbInstances(Builder builder) {
            this.dbInstanceName = builder.dbInstanceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DbInstances create() {
            return builder().build();
        }

        /**
         * @return dbInstanceName
         */
        public String getDbInstanceName() {
            return this.dbInstanceName;
        }

        public static final class Builder {
            private String dbInstanceName; 

            private Builder() {
            } 

            private Builder(DbInstances model) {
                this.dbInstanceName = model.dbInstanceName;
            } 

            /**
             * DbInstanceName.
             */
            public Builder dbInstanceName(String dbInstanceName) {
                this.dbInstanceName = dbInstanceName;
                return this;
            }

            public DbInstances build() {
                return new DbInstances(this);
            } 

        } 

    }
    /**
     * 
     * {@link DeleteWhitelistTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>DeleteWhitelistTemplateResponseBody</p>
     */
    public static class Templates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DbInstances")
        private java.util.List<DbInstances> dbInstances;

        @com.aliyun.core.annotation.NameInMap("SecurityIPList")
        private String securityIPList;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private String templateId;

        private Templates(Builder builder) {
            this.dbInstances = builder.dbInstances;
            this.securityIPList = builder.securityIPList;
            this.templateId = builder.templateId;
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

        public static final class Builder {
            private java.util.List<DbInstances> dbInstances; 
            private String securityIPList; 
            private String templateId; 

            private Builder() {
            } 

            private Builder(Templates model) {
                this.dbInstances = model.dbInstances;
                this.securityIPList = model.securityIPList;
                this.templateId = model.templateId;
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

            public Templates build() {
                return new Templates(this);
            } 

        } 

    }
    /**
     * 
     * {@link DeleteWhitelistTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>DeleteWhitelistTemplateResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Templates")
        private java.util.List<Templates> templates;

        private Data(Builder builder) {
            this.templates = builder.templates;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return templates
         */
        public java.util.List<Templates> getTemplates() {
            return this.templates;
        }

        public static final class Builder {
            private java.util.List<Templates> templates; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.templates = model.templates;
            } 

            /**
             * Templates.
             */
            public Builder templates(java.util.List<Templates> templates) {
                this.templates = templates;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}

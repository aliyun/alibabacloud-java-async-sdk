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
 * {@link ListWhitelistTemplatesResponseBody} extends {@link TeaModel}
 *
 * <p>ListWhitelistTemplatesResponseBody</p>
 */
public class ListWhitelistTemplatesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListWhitelistTemplatesResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWhitelistTemplatesResponseBody create() {
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

        private Builder(ListWhitelistTemplatesResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The query results.</p>
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

        public ListWhitelistTemplatesResponseBody build() {
            return new ListWhitelistTemplatesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListWhitelistTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>ListWhitelistTemplatesResponseBody</p>
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
             * <p>cc-asdfwef</p>
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
     * {@link ListWhitelistTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>ListWhitelistTemplatesResponseBody</p>
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
             * <p>The list of associated instances.</p>
             */
            public Builder dbInstances(java.util.List<DbInstances> dbInstances) {
                this.dbInstances = dbInstances;
                return this;
            }

            /**
             * <p>The IP address whitelist.</p>
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
             * <p>g-asdfwem</p>
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
     * {@link ListWhitelistTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>ListWhitelistTemplatesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrPageNumbers")
        private Integer currPageNumbers;

        @com.aliyun.core.annotation.NameInMap("HasNext")
        private Boolean hasNext;

        @com.aliyun.core.annotation.NameInMap("HasPrev")
        private Boolean hasPrev;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("Templates")
        private java.util.List<Templates> templates;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        @com.aliyun.core.annotation.NameInMap("TotalPageNumbers")
        private Integer totalPageNumbers;

        private Data(Builder builder) {
            this.currPageNumbers = builder.currPageNumbers;
            this.hasNext = builder.hasNext;
            this.hasPrev = builder.hasPrev;
            this.pageSize = builder.pageSize;
            this.templates = builder.templates;
            this.totalCount = builder.totalCount;
            this.totalPageNumbers = builder.totalPageNumbers;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return currPageNumbers
         */
        public Integer getCurrPageNumbers() {
            return this.currPageNumbers;
        }

        /**
         * @return hasNext
         */
        public Boolean getHasNext() {
            return this.hasNext;
        }

        /**
         * @return hasPrev
         */
        public Boolean getHasPrev() {
            return this.hasPrev;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return templates
         */
        public java.util.List<Templates> getTemplates() {
            return this.templates;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        /**
         * @return totalPageNumbers
         */
        public Integer getTotalPageNumbers() {
            return this.totalPageNumbers;
        }

        public static final class Builder {
            private Integer currPageNumbers; 
            private Boolean hasNext; 
            private Boolean hasPrev; 
            private Integer pageSize; 
            private java.util.List<Templates> templates; 
            private Integer totalCount; 
            private Integer totalPageNumbers; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.currPageNumbers = model.currPageNumbers;
                this.hasNext = model.hasNext;
                this.hasPrev = model.hasPrev;
                this.pageSize = model.pageSize;
                this.templates = model.templates;
                this.totalCount = model.totalCount;
                this.totalPageNumbers = model.totalPageNumbers;
            } 

            /**
             * <p>The current page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currPageNumbers(Integer currPageNumbers) {
                this.currPageNumbers = currPageNumbers;
                return this;
            }

            /**
             * <p>Whether a next page exists.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder hasNext(Boolean hasNext) {
                this.hasNext = hasNext;
                return this;
            }

            /**
             * <p>Whether a previous page exists.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder hasPrev(Boolean hasPrev) {
                this.hasPrev = hasPrev;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The list of whitelist templates.</p>
             */
            public Builder templates(java.util.List<Templates> templates) {
                this.templates = templates;
                return this;
            }

            /**
             * <p>The total number of templates.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * <p>The total number of pages.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder totalPageNumbers(Integer totalPageNumbers) {
                this.totalPageNumbers = totalPageNumbers;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}

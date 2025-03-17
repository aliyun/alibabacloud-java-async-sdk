// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

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
 * {@link ListDataSourceResponseBody} extends {@link TeaModel}
 *
 * <p>ListDataSourceResponseBody</p>
 */
public class ListDataSourceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private java.util.List<Result> result;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListDataSourceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataSourceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public java.util.List<Result> getResult() {
        return this.result;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<Result> result; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListDataSourceResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
            this.success = model.success;
        } 

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7FC9A6A6-****-5CED-B*****E891E4075</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Array of data source information.</p>
         */
        public Builder result(java.util.List<Result> result) {
            this.result = result;
            return this;
        }

        /**
         * <p>Whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListDataSourceResponseBody build() {
            return new ListDataSourceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDataSourceResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataSourceResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreatorId")
        private String creatorId;

        @com.aliyun.core.annotation.NameInMap("CreatorName")
        private String creatorName;

        @com.aliyun.core.annotation.NameInMap("DatasourceId")
        private String datasourceId;

        @com.aliyun.core.annotation.NameInMap("DsType")
        private String dsType;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("ParentDsType")
        private String parentDsType;

        @com.aliyun.core.annotation.NameInMap("ShowName")
        private String showName;

        private Result(Builder builder) {
            this.creatorId = builder.creatorId;
            this.creatorName = builder.creatorName;
            this.datasourceId = builder.datasourceId;
            this.dsType = builder.dsType;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.parentDsType = builder.parentDsType;
            this.showName = builder.showName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return creatorId
         */
        public String getCreatorId() {
            return this.creatorId;
        }

        /**
         * @return creatorName
         */
        public String getCreatorName() {
            return this.creatorName;
        }

        /**
         * @return datasourceId
         */
        public String getDatasourceId() {
            return this.datasourceId;
        }

        /**
         * @return dsType
         */
        public String getDsType() {
            return this.dsType;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return parentDsType
         */
        public String getParentDsType() {
            return this.parentDsType;
        }

        /**
         * @return showName
         */
        public String getShowName() {
            return this.showName;
        }

        public static final class Builder {
            private String creatorId; 
            private String creatorName; 
            private String datasourceId; 
            private String dsType; 
            private String gmtCreate; 
            private String gmtModified; 
            private String parentDsType; 
            private String showName; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.creatorId = model.creatorId;
                this.creatorName = model.creatorName;
                this.datasourceId = model.datasourceId;
                this.dsType = model.dsType;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.parentDsType = model.parentDsType;
                this.showName = model.showName;
            } 

            /**
             * <p>Quick BI user ID of the creator.</p>
             * 
             * <strong>example:</strong>
             * <p>281*****-485******-8</p>
             */
            public Builder creatorId(String creatorId) {
                this.creatorId = creatorId;
                return this;
            }

            /**
             * <p>Owner&quot;s nickname.</p>
             * 
             * <strong>example:</strong>
             * <p>system</p>
             */
            public Builder creatorName(String creatorName) {
                this.creatorName = creatorName;
                return this;
            }

            /**
             * <p>Data source ID.</p>
             * 
             * <strong>example:</strong>
             * <p>7FC9A6A6-****-5CED-B*****E891E4075</p>
             */
            public Builder datasourceId(String datasourceId) {
                this.datasourceId = datasourceId;
                return this;
            }

            /**
             * <p>Data source type.</p>
             * 
             * <strong>example:</strong>
             * <p>odps</p>
             */
            public Builder dsType(String dsType) {
                this.dsType = dsType;
                return this;
            }

            /**
             * <p>Creation time of the data source, in yyyy-MM-dd HH:mm:ss format.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-04-16 13:17:39</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>Modification time.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-08-15 10:06:31</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>Primary data source type for multi-engine data sources.</p>
             * 
             * <strong>example:</strong>
             * <p>dataphin</p>
             */
            public Builder parentDsType(String parentDsType) {
                this.parentDsType = parentDsType;
                return this;
            }

            /**
             * <p>Display name of the data source.</p>
             * 
             * <strong>example:</strong>
             * <p>0327</p>
             */
            public Builder showName(String showName) {
                this.showName = showName;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}

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
 * {@link GetDataQualityTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>GetDataQualityTemplateResponseBody</p>
 */
public class GetDataQualityTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataQualityTemplate")
    private DataQualityTemplate dataQualityTemplate;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetDataQualityTemplateResponseBody(Builder builder) {
        this.dataQualityTemplate = builder.dataQualityTemplate;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDataQualityTemplateResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataQualityTemplate
     */
    public DataQualityTemplate getDataQualityTemplate() {
        return this.dataQualityTemplate;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DataQualityTemplate dataQualityTemplate; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetDataQualityTemplateResponseBody model) {
            this.dataQualityTemplate = model.dataQualityTemplate;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The data quality rule template.</p>
         */
        public Builder dataQualityTemplate(DataQualityTemplate dataQualityTemplate) {
            this.dataQualityTemplate = dataQualityTemplate;
            return this;
        }

        /**
         * <p>The API request ID, which is generated as a UUID.</p>
         * 
         * <strong>example:</strong>
         * <p>0bc14115***159376359</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetDataQualityTemplateResponseBody build() {
            return new GetDataQualityTemplateResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDataQualityTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataQualityTemplateResponseBody</p>
     */
    public static class DataQualityTemplate extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("CreateUser")
        private String createUser;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private Long modifyTime;

        @com.aliyun.core.annotation.NameInMap("ModifyUser")
        private String modifyUser;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("Spec")
        private String spec;

        private DataQualityTemplate(Builder builder) {
            this.createTime = builder.createTime;
            this.createUser = builder.createUser;
            this.id = builder.id;
            this.modifyTime = builder.modifyTime;
            this.modifyUser = builder.modifyUser;
            this.owner = builder.owner;
            this.projectId = builder.projectId;
            this.spec = builder.spec;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataQualityTemplate create() {
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
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return modifyTime
         */
        public Long getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return modifyUser
         */
        public String getModifyUser() {
            return this.modifyUser;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        /**
         * @return spec
         */
        public String getSpec() {
            return this.spec;
        }

        public static final class Builder {
            private Long createTime; 
            private String createUser; 
            private String id; 
            private Long modifyTime; 
            private String modifyUser; 
            private String owner; 
            private Long projectId; 
            private String spec; 

            private Builder() {
            } 

            private Builder(DataQualityTemplate model) {
                this.createTime = model.createTime;
                this.createUser = model.createUser;
                this.id = model.id;
                this.modifyTime = model.modifyTime;
                this.modifyUser = model.modifyUser;
                this.owner = model.owner;
                this.projectId = model.projectId;
                this.spec = model.spec;
            } 

            /**
             * <p>The time when the data quality rule template was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1606724043000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The creator of the data quality rule template.</p>
             * 
             * <strong>example:</strong>
             * <p>238428342865</p>
             */
            public Builder createUser(String createUser) {
                this.createUser = createUser;
                return this;
            }

            /**
             * <p>The ID of the data quality rule template.</p>
             * 
             * <strong>example:</strong>
             * <p>10001</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The time when the data quality rule template was updated.</p>
             * 
             * <strong>example:</strong>
             * <p>1606724043000</p>
             */
            public Builder modifyTime(Long modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>The last updater of the data quality rule template.</p>
             * 
             * <strong>example:</strong>
             * <p>238428342865</p>
             */
            public Builder modifyUser(String modifyUser) {
                this.modifyUser = modifyUser;
                return this;
            }

            /**
             * <p>The owner of the data quality rule template.</p>
             * 
             * <strong>example:</strong>
             * <p>238428342865</p>
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * <p>The project ID.</p>
             * 
             * <strong>example:</strong>
             * <p>97535</p>
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>Specific configurations of the data quality rule template. For more information, see <a href="~2963394~">Data quality Spec configuration description</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *     &quot;assertion&quot;: &quot;anomaly detection fro id_not_null_cnt&quot;,
             *     &quot;id_not_null_cnt&quot;: {
             *         &quot;query&quot;: &quot;SELECT COUNT(*) AS cnt FROM ${tableName} WHERE dt = &quot;$[yyyymmdd-1]&quot;;&quot;
             *     },
             *     &quot;identity&quot;: &quot;819cf1f8-29be-4f94-a9d0-c5c06c0c3d2a&quot;
             * }</p>
             */
            public Builder spec(String spec) {
                this.spec = spec;
                return this;
            }

            public DataQualityTemplate build() {
                return new DataQualityTemplate(this);
            } 

        } 

    }
}

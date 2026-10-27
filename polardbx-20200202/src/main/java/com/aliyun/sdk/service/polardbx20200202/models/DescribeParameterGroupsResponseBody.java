// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

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
 * {@link DescribeParameterGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeParameterGroupsResponseBody</p>
 */
public class DescribeParameterGroupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeParameterGroupsResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeParameterGroupsResponseBody create() {
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

        private Builder(DescribeParameterGroupsResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The instance details.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>9B2F3840-5C98-475C-B269-2D5C3A31797C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeParameterGroupsResponseBody build() {
            return new DescribeParameterGroupsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeParameterGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeParameterGroupsResponseBody</p>
     */
    public static class ParameterGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CnForceRestart")
        private Boolean cnForceRestart;

        @com.aliyun.core.annotation.NameInMap("CnParamCount")
        private Integer cnParamCount;

        @com.aliyun.core.annotation.NameInMap("DbType")
        private String dbType;

        @com.aliyun.core.annotation.NameInMap("DbVersion")
        private String dbVersion;

        @com.aliyun.core.annotation.NameInMap("DnForceRestart")
        private Boolean dnForceRestart;

        @com.aliyun.core.annotation.NameInMap("DnParamCount")
        private Integer dnParamCount;

        @com.aliyun.core.annotation.NameInMap("GmtCreated")
        private String gmtCreated;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("ParameterGroupId")
        private String parameterGroupId;

        @com.aliyun.core.annotation.NameInMap("ParameterGroupName")
        private String parameterGroupName;

        @com.aliyun.core.annotation.NameInMap("ParameterGroupType")
        private String parameterGroupType;

        @com.aliyun.core.annotation.NameInMap("Series")
        private String series;

        private ParameterGroups(Builder builder) {
            this.cnForceRestart = builder.cnForceRestart;
            this.cnParamCount = builder.cnParamCount;
            this.dbType = builder.dbType;
            this.dbVersion = builder.dbVersion;
            this.dnForceRestart = builder.dnForceRestart;
            this.dnParamCount = builder.dnParamCount;
            this.gmtCreated = builder.gmtCreated;
            this.gmtModified = builder.gmtModified;
            this.parameterGroupId = builder.parameterGroupId;
            this.parameterGroupName = builder.parameterGroupName;
            this.parameterGroupType = builder.parameterGroupType;
            this.series = builder.series;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ParameterGroups create() {
            return builder().build();
        }

        /**
         * @return cnForceRestart
         */
        public Boolean getCnForceRestart() {
            return this.cnForceRestart;
        }

        /**
         * @return cnParamCount
         */
        public Integer getCnParamCount() {
            return this.cnParamCount;
        }

        /**
         * @return dbType
         */
        public String getDbType() {
            return this.dbType;
        }

        /**
         * @return dbVersion
         */
        public String getDbVersion() {
            return this.dbVersion;
        }

        /**
         * @return dnForceRestart
         */
        public Boolean getDnForceRestart() {
            return this.dnForceRestart;
        }

        /**
         * @return dnParamCount
         */
        public Integer getDnParamCount() {
            return this.dnParamCount;
        }

        /**
         * @return gmtCreated
         */
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return parameterGroupId
         */
        public String getParameterGroupId() {
            return this.parameterGroupId;
        }

        /**
         * @return parameterGroupName
         */
        public String getParameterGroupName() {
            return this.parameterGroupName;
        }

        /**
         * @return parameterGroupType
         */
        public String getParameterGroupType() {
            return this.parameterGroupType;
        }

        /**
         * @return series
         */
        public String getSeries() {
            return this.series;
        }

        public static final class Builder {
            private Boolean cnForceRestart; 
            private Integer cnParamCount; 
            private String dbType; 
            private String dbVersion; 
            private Boolean dnForceRestart; 
            private Integer dnParamCount; 
            private String gmtCreated; 
            private String gmtModified; 
            private String parameterGroupId; 
            private String parameterGroupName; 
            private String parameterGroupType; 
            private String series; 

            private Builder() {
            } 

            private Builder(ParameterGroups model) {
                this.cnForceRestart = model.cnForceRestart;
                this.cnParamCount = model.cnParamCount;
                this.dbType = model.dbType;
                this.dbVersion = model.dbVersion;
                this.dnForceRestart = model.dnForceRestart;
                this.dnParamCount = model.dnParamCount;
                this.gmtCreated = model.gmtCreated;
                this.gmtModified = model.gmtModified;
                this.parameterGroupId = model.parameterGroupId;
                this.parameterGroupName = model.parameterGroupName;
                this.parameterGroupType = model.parameterGroupType;
                this.series = model.series;
            } 

            /**
             * <p>Indicates whether a forced restart of CN is required.</p>
             */
            public Builder cnForceRestart(Boolean cnForceRestart) {
                this.cnForceRestart = cnForceRestart;
                return this;
            }

            /**
             * <p>The number of CN parameters.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder cnParamCount(Integer cnParamCount) {
                this.cnParamCount = cnParamCount;
                return this;
            }

            /**
             * <p>The database type.</p>
             * 
             * <strong>example:</strong>
             * <p>polarx</p>
             */
            public Builder dbType(String dbType) {
                this.dbType = dbType;
                return this;
            }

            /**
             * <p>The database engine version.</p>
             * 
             * <strong>example:</strong>
             * <p>5.7</p>
             */
            public Builder dbVersion(String dbVersion) {
                this.dbVersion = dbVersion;
                return this;
            }

            /**
             * <p>Indicates whether a forced restart of DN is required.</p>
             */
            public Builder dnForceRestart(Boolean dnForceRestart) {
                this.dnForceRestart = dnForceRestart;
                return this;
            }

            /**
             * <p>The number of DN parameters.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder dnParamCount(Integer dnParamCount) {
                this.dnParamCount = dnParamCount;
                return this;
            }

            /**
             * <p>The time when the account was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-12-19T16:41:31+08:00</p>
             */
            public Builder gmtCreated(String gmtCreated) {
                this.gmtCreated = gmtCreated;
                return this;
            }

            /**
             * <p>The modification time, in timestamp format.</p>
             * 
             * <strong>example:</strong>
             * <p>1605079985000</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The parameter template ID.</p>
             * <blockquote>
             * <p>You can call the <a href="https://help.aliyun.com/document_detail/207178.html">DescribeParameterGroups</a> operation to query the details of all parameter templates in the specified region, including the parameter template ID.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>rpg-s1y1xy06****fqs7y</p>
             */
            public Builder parameterGroupId(String parameterGroupId) {
                this.parameterGroupId = parameterGroupId;
                return this;
            }

            /**
             * <p>The parameter template name.</p>
             * 
             * <strong>example:</strong>
             * <p>dstest_api_new</p>
             */
            public Builder parameterGroupName(String parameterGroupName) {
                this.parameterGroupName = parameterGroupName;
                return this;
            }

            /**
             * <p>The parameter templatetype.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder parameterGroupType(String parameterGroupType) {
                this.parameterGroupType = parameterGroupType;
                return this;
            }

            /**
             * <p>The instance edition. Valid values:</p>
             * <ul>
             * <li><strong>enterprise</strong>: Enterprise Edition.</li>
             * <li><strong>standard</strong>: Standard Edition.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>enterprise</p>
             */
            public Builder series(String series) {
                this.series = series;
                return this;
            }

            public ParameterGroups build() {
                return new ParameterGroups(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeParameterGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeParameterGroupsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ParameterGroups")
        private java.util.List<ParameterGroups> parameterGroups;

        @com.aliyun.core.annotation.NameInMap("RequestId")
        private String requestId;

        private Data(Builder builder) {
            this.parameterGroups = builder.parameterGroups;
            this.requestId = builder.requestId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return parameterGroups
         */
        public java.util.List<ParameterGroups> getParameterGroups() {
            return this.parameterGroups;
        }

        /**
         * @return requestId
         */
        public String getRequestId() {
            return this.requestId;
        }

        public static final class Builder {
            private java.util.List<ParameterGroups> parameterGroups; 
            private String requestId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.parameterGroups = model.parameterGroups;
                this.requestId = model.requestId;
            } 

            /**
             * <p>The parameter template name.</p>
             */
            public Builder parameterGroups(java.util.List<ParameterGroups> parameterGroups) {
                this.parameterGroups = parameterGroups;
                return this;
            }

            /**
             * <p>The request ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1E5DCFFC-A00D-****-836E-73318F8CA577</p>
             */
            public Builder requestId(String requestId) {
                this.requestId = requestId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

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
 * {@link ListRecallManagementServiceVersionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListRecallManagementServiceVersionsResponseBody</p>
 */
public class ListRecallManagementServiceVersionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RecallManagementServiceVersions")
    private java.util.List<RecallManagementServiceVersions> recallManagementServiceVersions;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private String totalCount;

    private ListRecallManagementServiceVersionsResponseBody(Builder builder) {
        this.recallManagementServiceVersions = builder.recallManagementServiceVersions;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRecallManagementServiceVersionsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return recallManagementServiceVersions
     */
    public java.util.List<RecallManagementServiceVersions> getRecallManagementServiceVersions() {
        return this.recallManagementServiceVersions;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public String getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<RecallManagementServiceVersions> recallManagementServiceVersions; 
        private String requestId; 
        private String totalCount; 

        private Builder() {
        } 

        private Builder(ListRecallManagementServiceVersionsResponseBody model) {
            this.recallManagementServiceVersions = model.recallManagementServiceVersions;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>A list of Recall Management Service versions.</p>
         */
        public Builder recallManagementServiceVersions(java.util.List<RecallManagementServiceVersions> recallManagementServiceVersions) {
            this.recallManagementServiceVersions = recallManagementServiceVersions;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>728C5E01-ABF6-5AA8-B9FC-B3BA05DECC77</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListRecallManagementServiceVersionsResponseBody build() {
            return new ListRecallManagementServiceVersionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListRecallManagementServiceVersionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListRecallManagementServiceVersionsResponseBody</p>
     */
    public static class RecallManagementServiceVersions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
        private String gmtCreateTime;

        @com.aliyun.core.annotation.NameInMap("GmtModifiedTime")
        private String gmtModifiedTime;

        @com.aliyun.core.annotation.NameInMap("IsEffective")
        private Boolean isEffective;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("RecallManagementServiceVersionId")
        private String recallManagementServiceVersionId;

        private RecallManagementServiceVersions(Builder builder) {
            this.gmtCreateTime = builder.gmtCreateTime;
            this.gmtModifiedTime = builder.gmtModifiedTime;
            this.isEffective = builder.isEffective;
            this.name = builder.name;
            this.recallManagementServiceVersionId = builder.recallManagementServiceVersionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecallManagementServiceVersions create() {
            return builder().build();
        }

        /**
         * @return gmtCreateTime
         */
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        /**
         * @return gmtModifiedTime
         */
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        /**
         * @return isEffective
         */
        public Boolean getIsEffective() {
            return this.isEffective;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return recallManagementServiceVersionId
         */
        public String getRecallManagementServiceVersionId() {
            return this.recallManagementServiceVersionId;
        }

        public static final class Builder {
            private String gmtCreateTime; 
            private String gmtModifiedTime; 
            private Boolean isEffective; 
            private String name; 
            private String recallManagementServiceVersionId; 

            private Builder() {
            } 

            private Builder(RecallManagementServiceVersions model) {
                this.gmtCreateTime = model.gmtCreateTime;
                this.gmtModifiedTime = model.gmtModifiedTime;
                this.isEffective = model.isEffective;
                this.name = model.name;
                this.recallManagementServiceVersionId = model.recallManagementServiceVersionId;
            } 

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-12-15T23:24:33.132+08:00</p>
             */
            public Builder gmtCreateTime(String gmtCreateTime) {
                this.gmtCreateTime = gmtCreateTime;
                return this;
            }

            /**
             * <p>The modification time.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-12-15T23:24:33.132+08:00</p>
             */
            public Builder gmtModifiedTime(String gmtModifiedTime) {
                this.gmtModifiedTime = gmtModifiedTime;
                return this;
            }

            /**
             * <p>Indicates whether the version is effective.</p>
             */
            public Builder isEffective(Boolean isEffective) {
                this.isEffective = isEffective;
                return this;
            }

            /**
             * <p>The version name.</p>
             * 
             * <strong>example:</strong>
             * <p>version-1</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The version ID of the Recall Management Service.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder recallManagementServiceVersionId(String recallManagementServiceVersionId) {
                this.recallManagementServiceVersionId = recallManagementServiceVersionId;
                return this;
            }

            public RecallManagementServiceVersions build() {
                return new RecallManagementServiceVersions(this);
            } 

        } 

    }
}

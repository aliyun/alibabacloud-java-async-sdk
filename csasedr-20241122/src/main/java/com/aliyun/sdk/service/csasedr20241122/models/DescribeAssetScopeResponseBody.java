// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csasedr20241122.models;

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
 * {@link DescribeAssetScopeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAssetScopeResponseBody</p>
 */
public class DescribeAssetScopeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeAssetScopeResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAssetScopeResponseBody create() {
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

        private Builder(DescribeAssetScopeResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The endpoint asset scope details.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The unique identifier of the request, which is used to troubleshoot and locate issues.</p>
         * 
         * <strong>example:</strong>
         * <p>01A157FA-F957-3A5A-A6B8-5BBB8ADB****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAssetScopeResponseBody build() {
            return new DescribeAssetScopeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAssetScopeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAssetScopeResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private Long gmtModified;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("MatchMode")
        private String matchMode;

        @com.aliyun.core.annotation.NameInMap("MatchTargetIds")
        private java.util.List<String> matchTargetIds;

        private Data(Builder builder) {
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.matchMode = builder.matchMode;
            this.matchTargetIds = builder.matchTargetIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public Long getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return matchMode
         */
        public String getMatchMode() {
            return this.matchMode;
        }

        /**
         * @return matchTargetIds
         */
        public java.util.List<String> getMatchTargetIds() {
            return this.matchTargetIds;
        }

        public static final class Builder {
            private Long gmtCreate; 
            private Long gmtModified; 
            private Long id; 
            private String matchMode; 
            private java.util.List<String> matchTargetIds; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.id = model.id;
                this.matchMode = model.matchMode;
                this.matchTargetIds = model.matchTargetIds;
            } 

            /**
             * <p><strong>[Deprecated]</strong> This field is deprecated.</p>
             * 
             * <strong>example:</strong>
             * <p>1792800000000</p>
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong> This field is deprecated.</p>
             * 
             * <strong>example:</strong>
             * <p>1792803600000</p>
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The ID of the asset scope record, which corresponds to the Id request parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>1932</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The effective scope mode. Valid values:</p>
             * <ul>
             * <li><strong>UserGroupAll</strong>: all user groups.</li>
             * <li><strong>UserGroupNormal</strong>: specified user groups.</li>
             * <li><strong>DeviceGroupNormal</strong>: specified device groups.</li>
             * <li><strong>DevTagNormal</strong>: specified device tags.</li>
             * </ul>
             * <p>The meaning of MatchTargetIds is determined by this field.</p>
             * 
             * <strong>example:</strong>
             * <p>UserGroupNormal</p>
             */
            public Builder matchMode(String matchMode) {
                this.matchMode = matchMode;
                return this;
            }

            /**
             * <p>The list of effective scope targets. All elements are strings. The meaning of each element is determined by MatchMode:</p>
             * <ul>
             * <li><strong>UserGroupAll</strong>: Scope matching does not depend on this list.</li>
             * <li><strong>UserGroupNormal</strong>: the user group ID.</li>
             * <li><strong>DeviceGroupNormal</strong>: the device group ID.</li>
             * <li><strong>DevTagNormal</strong>: the device tag value.</li>
             * </ul>
             * <p>This list is not a list of matched endpoint UUIDs.</p>
             */
            public Builder matchTargetIds(java.util.List<String> matchTargetIds) {
                this.matchTargetIds = matchTargetIds;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}

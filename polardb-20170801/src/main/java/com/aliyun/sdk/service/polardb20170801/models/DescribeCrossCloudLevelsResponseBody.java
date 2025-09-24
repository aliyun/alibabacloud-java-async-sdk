// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribeCrossCloudLevelsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCrossCloudLevelsResponseBody</p>
 */
public class DescribeCrossCloudLevelsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CrossCloudLevelList")
    private java.util.List<CrossCloudLevelList> crossCloudLevelList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeCrossCloudLevelsResponseBody(Builder builder) {
        this.crossCloudLevelList = builder.crossCloudLevelList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCrossCloudLevelsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return crossCloudLevelList
     */
    public java.util.List<CrossCloudLevelList> getCrossCloudLevelList() {
        return this.crossCloudLevelList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<CrossCloudLevelList> crossCloudLevelList; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeCrossCloudLevelsResponseBody model) {
            this.crossCloudLevelList = model.crossCloudLevelList;
            this.requestId = model.requestId;
        } 

        /**
         * CrossCloudLevelList.
         */
        public Builder crossCloudLevelList(java.util.List<CrossCloudLevelList> crossCloudLevelList) {
            this.crossCloudLevelList = crossCloudLevelList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCrossCloudLevelsResponseBody build() {
            return new DescribeCrossCloudLevelsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCrossCloudLevelsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCrossCloudLevelsResponseBody</p>
     */
    public static class CrossCloudLevelList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBType")
        private String DBType;

        @com.aliyun.core.annotation.NameInMap("LevelCode")
        private String levelCode;

        @com.aliyun.core.annotation.NameInMap("LevelName")
        private String levelName;

        private CrossCloudLevelList(Builder builder) {
            this.DBType = builder.DBType;
            this.levelCode = builder.levelCode;
            this.levelName = builder.levelName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CrossCloudLevelList create() {
            return builder().build();
        }

        /**
         * @return DBType
         */
        public String getDBType() {
            return this.DBType;
        }

        /**
         * @return levelCode
         */
        public String getLevelCode() {
            return this.levelCode;
        }

        /**
         * @return levelName
         */
        public String getLevelName() {
            return this.levelName;
        }

        public static final class Builder {
            private String DBType; 
            private String levelCode; 
            private String levelName; 

            private Builder() {
            } 

            private Builder(CrossCloudLevelList model) {
                this.DBType = model.DBType;
                this.levelCode = model.levelCode;
                this.levelName = model.levelName;
            } 

            /**
             * DBType.
             */
            public Builder DBType(String DBType) {
                this.DBType = DBType;
                return this;
            }

            /**
             * LevelCode.
             */
            public Builder levelCode(String levelCode) {
                this.levelCode = levelCode;
                return this;
            }

            /**
             * LevelName.
             */
            public Builder levelName(String levelName) {
                this.levelName = levelName;
                return this;
            }

            public CrossCloudLevelList build() {
                return new CrossCloudLevelList(this);
            } 

        } 

    }
}

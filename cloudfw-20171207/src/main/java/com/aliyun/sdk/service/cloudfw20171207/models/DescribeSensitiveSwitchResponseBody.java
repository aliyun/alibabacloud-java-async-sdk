// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DescribeSensitiveSwitchResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSensitiveSwitchResponseBody</p>
 */
public class DescribeSensitiveSwitchResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("OpenCount")
    private Long openCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    @com.aliyun.core.annotation.NameInMap("UserSensitiveDataSwitchList")
    private java.util.List<UserSensitiveDataSwitchList> userSensitiveDataSwitchList;

    private DescribeSensitiveSwitchResponseBody(Builder builder) {
        this.openCount = builder.openCount;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.userSensitiveDataSwitchList = builder.userSensitiveDataSwitchList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSensitiveSwitchResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return openCount
     */
    public Long getOpenCount() {
        return this.openCount;
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return userSensitiveDataSwitchList
     */
    public java.util.List<UserSensitiveDataSwitchList> getUserSensitiveDataSwitchList() {
        return this.userSensitiveDataSwitchList;
    }

    public static final class Builder {
        private Long openCount; 
        private String requestId; 
        private Long totalCount; 
        private java.util.List<UserSensitiveDataSwitchList> userSensitiveDataSwitchList; 

        private Builder() {
        } 

        private Builder(DescribeSensitiveSwitchResponseBody model) {
            this.openCount = model.openCount;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.userSensitiveDataSwitchList = model.userSensitiveDataSwitchList;
        } 

        /**
         * OpenCount.
         */
        public Builder openCount(Long openCount) {
            this.openCount = openCount;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * UserSensitiveDataSwitchList.
         */
        public Builder userSensitiveDataSwitchList(java.util.List<UserSensitiveDataSwitchList> userSensitiveDataSwitchList) {
            this.userSensitiveDataSwitchList = userSensitiveDataSwitchList;
            return this;
        }

        public DescribeSensitiveSwitchResponseBody build() {
            return new DescribeSensitiveSwitchResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSensitiveSwitchResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSensitiveSwitchResponseBody</p>
     */
    public static class UserSensitiveDataSwitchList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CategoryName")
        private String categoryName;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("SensitiveCategory")
        private String sensitiveCategory;

        @com.aliyun.core.annotation.NameInMap("SensitiveLevel")
        private String sensitiveLevel;

        @com.aliyun.core.annotation.NameInMap("SwitchStatus")
        private Integer switchStatus;

        private UserSensitiveDataSwitchList(Builder builder) {
            this.categoryName = builder.categoryName;
            this.description = builder.description;
            this.sensitiveCategory = builder.sensitiveCategory;
            this.sensitiveLevel = builder.sensitiveLevel;
            this.switchStatus = builder.switchStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserSensitiveDataSwitchList create() {
            return builder().build();
        }

        /**
         * @return categoryName
         */
        public String getCategoryName() {
            return this.categoryName;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return sensitiveCategory
         */
        public String getSensitiveCategory() {
            return this.sensitiveCategory;
        }

        /**
         * @return sensitiveLevel
         */
        public String getSensitiveLevel() {
            return this.sensitiveLevel;
        }

        /**
         * @return switchStatus
         */
        public Integer getSwitchStatus() {
            return this.switchStatus;
        }

        public static final class Builder {
            private String categoryName; 
            private String description; 
            private String sensitiveCategory; 
            private String sensitiveLevel; 
            private Integer switchStatus; 

            private Builder() {
            } 

            private Builder(UserSensitiveDataSwitchList model) {
                this.categoryName = model.categoryName;
                this.description = model.description;
                this.sensitiveCategory = model.sensitiveCategory;
                this.sensitiveLevel = model.sensitiveLevel;
                this.switchStatus = model.switchStatus;
            } 

            /**
             * CategoryName.
             */
            public Builder categoryName(String categoryName) {
                this.categoryName = categoryName;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * SensitiveCategory.
             */
            public Builder sensitiveCategory(String sensitiveCategory) {
                this.sensitiveCategory = sensitiveCategory;
                return this;
            }

            /**
             * SensitiveLevel.
             */
            public Builder sensitiveLevel(String sensitiveLevel) {
                this.sensitiveLevel = sensitiveLevel;
                return this;
            }

            /**
             * SwitchStatus.
             */
            public Builder switchStatus(Integer switchStatus) {
                this.switchStatus = switchStatus;
                return this;
            }

            public UserSensitiveDataSwitchList build() {
                return new UserSensitiveDataSwitchList(this);
            } 

        } 

    }
}

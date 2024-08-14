// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DsgWhiteListAddOrUpdateRequest} extends {@link RequestModel}
 *
 * <p>DsgWhiteListAddOrUpdateRequest</p>
 */
public class DsgWhiteListAddOrUpdateRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WhiteLists")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < WhiteLists> whiteLists;

    private DsgWhiteListAddOrUpdateRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.whiteLists = builder.whiteLists;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DsgWhiteListAddOrUpdateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return whiteLists
     */
    public java.util.List < WhiteLists> getWhiteLists() {
        return this.whiteLists;
    }

    public static final class Builder extends Request.Builder<DsgWhiteListAddOrUpdateRequest, Builder> {
        private String regionId; 
        private java.util.List < WhiteLists> whiteLists; 

        private Builder() {
            super();
        } 

        private Builder(DsgWhiteListAddOrUpdateRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.whiteLists = request.whiteLists;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * A collection of whitelists.
         */
        public Builder whiteLists(java.util.List < WhiteLists> whiteLists) {
            String whiteListsShrink = shrink(whiteLists, "WhiteLists", "json");
            this.putQueryParameter("WhiteLists", whiteListsShrink);
            this.whiteLists = whiteLists;
            return this;
        }

        @Override
        public DsgWhiteListAddOrUpdateRequest build() {
            return new DsgWhiteListAddOrUpdateRequest(this);
        } 

    } 

    public static class WhiteLists extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Integer id;

        @com.aliyun.core.annotation.NameInMap("RuleId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer ruleId;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        @com.aliyun.core.annotation.Validation(required = true)
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("UserGroupIds")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List < Integer > userGroupIds;

        private WhiteLists(Builder builder) {
            this.endTime = builder.endTime;
            this.id = builder.id;
            this.ruleId = builder.ruleId;
            this.startTime = builder.startTime;
            this.userGroupIds = builder.userGroupIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WhiteLists create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return id
         */
        public Integer getId() {
            return this.id;
        }

        /**
         * @return ruleId
         */
        public Integer getRuleId() {
            return this.ruleId;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return userGroupIds
         */
        public java.util.List < Integer > getUserGroupIds() {
            return this.userGroupIds;
        }

        public static final class Builder {
            private String endTime; 
            private Integer id; 
            private Integer ruleId; 
            private String startTime; 
            private java.util.List < Integer > userGroupIds; 

            /**
             * The end of the time range to query. If you enter null, the whitelist is valid permanently.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * The ID of the data masking whitelist.
             * <p>
             * 
             * *   If you do not configure this parameter, the current operation is to add a data masking whitelist.
             * *   If you configure this parameter, the current operation is to modify a data masking whitelist. You can call the [DsgWhiteListQueryList](~~2786508~~) operation to query the whitelist ID.
             */
            public Builder id(Integer id) {
                this.id = id;
                return this;
            }

            /**
             * The ID of the data masking rule. You can call the [DsgDesensPlanQueryList](~~2786578~~) operation to query the ID of the data masking rule.
             */
            public Builder ruleId(Integer ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * The beginning of the time range to query.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * A collection of user group IDs.
             */
            public Builder userGroupIds(java.util.List < Integer > userGroupIds) {
                this.userGroupIds = userGroupIds;
                return this;
            }

            public WhiteLists build() {
                return new WhiteLists(this);
            } 

        } 

    }
}

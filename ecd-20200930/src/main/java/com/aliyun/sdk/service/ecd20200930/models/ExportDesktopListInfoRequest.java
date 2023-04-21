// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExportDesktopListInfoRequest} extends {@link RequestModel}
 *
 * <p>ExportDesktopListInfoRequest</p>
 */
public class ExportDesktopListInfoRequest extends Request {
    @Query
    @NameInMap("ChargeType")
    private String chargeType;

    @Query
    @NameInMap("DesktopId")
    private java.util.List < String > desktopId;

    @Query
    @NameInMap("DesktopName")
    private String desktopName;

    @Query
    @NameInMap("DesktopStatus")
    private String desktopStatus;

    @Query
    @NameInMap("EndUserId")
    private java.util.List < String > endUserId;

    @Query
    @NameInMap("ExpiredTime")
    private String expiredTime;

    @Query
    @NameInMap("GroupId")
    private String groupId;

    @Query
    @NameInMap("LangType")
    private String langType;

    @Query
    @NameInMap("MaxResults")
    @Validation(maximum = 100, minimum = 1)
    private Integer maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("OfficeSiteId")
    private String officeSiteId;

    @Query
    @NameInMap("PolicyGroupId")
    private String policyGroupId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    @Query
    @NameInMap("UserName")
    private String userName;

    private ExportDesktopListInfoRequest(Builder builder) {
        super(builder);
        this.chargeType = builder.chargeType;
        this.desktopId = builder.desktopId;
        this.desktopName = builder.desktopName;
        this.desktopStatus = builder.desktopStatus;
        this.endUserId = builder.endUserId;
        this.expiredTime = builder.expiredTime;
        this.groupId = builder.groupId;
        this.langType = builder.langType;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.officeSiteId = builder.officeSiteId;
        this.policyGroupId = builder.policyGroupId;
        this.regionId = builder.regionId;
        this.tag = builder.tag;
        this.userName = builder.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExportDesktopListInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return chargeType
     */
    public String getChargeType() {
        return this.chargeType;
    }

    /**
     * @return desktopId
     */
    public java.util.List < String > getDesktopId() {
        return this.desktopId;
    }

    /**
     * @return desktopName
     */
    public String getDesktopName() {
        return this.desktopName;
    }

    /**
     * @return desktopStatus
     */
    public String getDesktopStatus() {
        return this.desktopStatus;
    }

    /**
     * @return endUserId
     */
    public java.util.List < String > getEndUserId() {
        return this.endUserId;
    }

    /**
     * @return expiredTime
     */
    public String getExpiredTime() {
        return this.expiredTime;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return langType
     */
    public String getLangType() {
        return this.langType;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return officeSiteId
     */
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    /**
     * @return policyGroupId
     */
    public String getPolicyGroupId() {
        return this.policyGroupId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    public static final class Builder extends Request.Builder<ExportDesktopListInfoRequest, Builder> {
        private String chargeType; 
        private java.util.List < String > desktopId; 
        private String desktopName; 
        private String desktopStatus; 
        private java.util.List < String > endUserId; 
        private String expiredTime; 
        private String groupId; 
        private String langType; 
        private Integer maxResults; 
        private String nextToken; 
        private String officeSiteId; 
        private String policyGroupId; 
        private String regionId; 
        private java.util.List < Tag> tag; 
        private String userName; 

        private Builder() {
            super();
        } 

        private Builder(ExportDesktopListInfoRequest request) {
            super(request);
            this.chargeType = request.chargeType;
            this.desktopId = request.desktopId;
            this.desktopName = request.desktopName;
            this.desktopStatus = request.desktopStatus;
            this.endUserId = request.endUserId;
            this.expiredTime = request.expiredTime;
            this.groupId = request.groupId;
            this.langType = request.langType;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.officeSiteId = request.officeSiteId;
            this.policyGroupId = request.policyGroupId;
            this.regionId = request.regionId;
            this.tag = request.tag;
            this.userName = request.userName;
        } 

        /**
         * The billing method of the cloud desktop. Valid values:
         * <p>
         * 
         * *   PostPaid: pay-as-you-go
         * *   PrePaid: subscription
         * 
         * Default value: PostPaid.
         */
        public Builder chargeType(String chargeType) {
            this.putQueryParameter("ChargeType", chargeType);
            this.chargeType = chargeType;
            return this;
        }

        /**
         * The ID of cloud desktop N. Valid values of N: 1 to 100.
         */
        public Builder desktopId(java.util.List < String > desktopId) {
            this.putQueryParameter("DesktopId", desktopId);
            this.desktopId = desktopId;
            return this;
        }

        /**
         * The name of the cloud desktop.
         */
        public Builder desktopName(String desktopName) {
            this.putQueryParameter("DesktopName", desktopName);
            this.desktopName = desktopName;
            return this;
        }

        /**
         * The status of the cloud desktop. Valid values:
         * <p>
         * 
         * *   Pending: The cloud desktop is pending.
         * *   Starting: The cloud desktop is being started.
         * *   Running: The cloud desktop is running.
         * *   Stopping: The cloud desktop is being stopped.
         * *   Rebuilding: The cloud desktop is being rebuilt.
         * *   Stopped: The cloud desktop is stopped.
         * *   Expired: The cloud desktop expired.
         * *   Deleted: The cloud desktop is deleted.
         */
        public Builder desktopStatus(String desktopStatus) {
            this.putQueryParameter("DesktopStatus", desktopStatus);
            this.desktopStatus = desktopStatus;
            return this;
        }

        /**
         * The ID of end user N that is assigned the cloud desktop. Valid values of N: 1 to 100.
         * <p>
         * 
         * > Only one end user can use the cloud desktop at a time.
         */
        public Builder endUserId(java.util.List < String > endUserId) {
            this.putQueryParameter("EndUserId", endUserId);
            this.endUserId = endUserId;
            return this;
        }

        /**
         * The time when the subscription cloud desktop expires.
         */
        public Builder expiredTime(String expiredTime) {
            this.putQueryParameter("ExpiredTime", expiredTime);
            this.expiredTime = expiredTime;
            return this;
        }

        /**
         * The ID of the desktop group.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * The language in which the cloud desktop is displayed in the console UI. You can export the list of cloud desktops in the specified language. Valid values:
         * <p>
         * 
         * *   `zh-CN`: Simplified Chinese
         * *   `en-GB`: English (United Kingdom)
         * 
         * Default value: `zh-CN`.
         */
        public Builder langType(String langType) {
            this.putQueryParameter("LangType", langType);
            this.langType = langType;
            return this;
        }

        /**
         * The number of entries to return on each page.
         * <p>
         * 
         * Maximum value: 100.
         * 
         * Default value: 10.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The token that determines the start point of the next query. If this parameter is left empty, all results are returned.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The ID of the workspace.
         */
        public Builder officeSiteId(String officeSiteId) {
            this.putQueryParameter("OfficeSiteId", officeSiteId);
            this.officeSiteId = officeSiteId;
            return this;
        }

        /**
         * The ID of the policy that is associated with the cloud desktop.
         */
        public Builder policyGroupId(String policyGroupId) {
            this.putQueryParameter("PolicyGroupId", policyGroupId);
            this.policyGroupId = policyGroupId;
            return this;
        }

        /**
         * The ID of the region.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The tags. A tag is a key-value pair that consists of a tag key and a tag value. Tags are used to identify resources. You can use tags to manage cloud desktops by group for easy searching and batch operations. For more information, see [Use tags to manage cloud desktops](~~203781~~).
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * The username of the end user that is using the cloud desktop.
         */
        public Builder userName(String userName) {
            this.putQueryParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        @Override
        public ExportDesktopListInfoRequest build() {
            return new ExportDesktopListInfoRequest(this);
        } 

    } 

    public static class Tag extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * The key of the tag. If you specify the `Tag` parameter, you must also specify the `Key` parameter. The tag key can be up to 128 characters in length and cannot contain `http://` or `https://`. The tag key cannot start with `aliyun` or `acs:`. You cannot specify an empty string as a tag key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of the tag. The tag value can be up to 128 characters in length and cannot contain `http://` or `https://`. The tag value cannot start with `aliyun` or `acs:`.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20180601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRaceWorkForInnerResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRaceWorkForInnerResponseBody</p>
 */
public class DescribeRaceWorkForInnerResponseBody extends TeaModel {
    @NameInMap("CommodityCode")
    private String commodityCode;

    @NameInMap("CreateTime")
    private String createTime;

    @NameInMap("GroupId")
    private String groupId;

    @NameInMap("Keywords")
    private String keywords;

    @NameInMap("LogoUrl")
    private String logoUrl;

    @NameInMap("ModifiedTime")
    private String modifiedTime;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ShortDescription")
    private String shortDescription;

    @NameInMap("WorkName")
    private String workName;

    private DescribeRaceWorkForInnerResponseBody(Builder builder) {
        this.commodityCode = builder.commodityCode;
        this.createTime = builder.createTime;
        this.groupId = builder.groupId;
        this.keywords = builder.keywords;
        this.logoUrl = builder.logoUrl;
        this.modifiedTime = builder.modifiedTime;
        this.requestId = builder.requestId;
        this.shortDescription = builder.shortDescription;
        this.workName = builder.workName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRaceWorkForInnerResponseBody create() {
        return builder().build();
    }

    /**
     * @return commodityCode
     */
    public String getCommodityCode() {
        return this.commodityCode;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return keywords
     */
    public String getKeywords() {
        return this.keywords;
    }

    /**
     * @return logoUrl
     */
    public String getLogoUrl() {
        return this.logoUrl;
    }

    /**
     * @return modifiedTime
     */
    public String getModifiedTime() {
        return this.modifiedTime;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return shortDescription
     */
    public String getShortDescription() {
        return this.shortDescription;
    }

    /**
     * @return workName
     */
    public String getWorkName() {
        return this.workName;
    }

    public static final class Builder {
        private String commodityCode; 
        private String createTime; 
        private String groupId; 
        private String keywords; 
        private String logoUrl; 
        private String modifiedTime; 
        private String requestId; 
        private String shortDescription; 
        private String workName; 

        /**
         * CommodityCode.
         */
        public Builder commodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * GroupId.
         */
        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        /**
         * Keywords.
         */
        public Builder keywords(String keywords) {
            this.keywords = keywords;
            return this;
        }

        /**
         * LogoUrl.
         */
        public Builder logoUrl(String logoUrl) {
            this.logoUrl = logoUrl;
            return this;
        }

        /**
         * ModifiedTime.
         */
        public Builder modifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
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
         * ShortDescription.
         */
        public Builder shortDescription(String shortDescription) {
            this.shortDescription = shortDescription;
            return this;
        }

        /**
         * WorkName.
         */
        public Builder workName(String workName) {
            this.workName = workName;
            return this;
        }

        public DescribeRaceWorkForInnerResponseBody build() {
            return new DescribeRaceWorkForInnerResponseBody(this);
        } 

    } 

}

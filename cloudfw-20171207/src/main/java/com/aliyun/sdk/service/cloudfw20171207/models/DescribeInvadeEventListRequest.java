// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInvadeEventListRequest} extends {@link RequestModel}
 *
 * <p>DescribeInvadeEventListRequest</p>
 */
public class DescribeInvadeEventListRequest extends Request {
    @Query
    @NameInMap("AssetsIP")
    private String assetsIP;

    @Query
    @NameInMap("AssetsInstanceId")
    private String assetsInstanceId;

    @Query
    @NameInMap("AssetsInstanceName")
    private String assetsInstanceName;

    @Query
    @NameInMap("CurrentPage")
    private String currentPage;

    @Query
    @NameInMap("EndTime")
    private String endTime;

    @Query
    @NameInMap("EventKey")
    private String eventKey;

    @Query
    @NameInMap("EventName")
    private String eventName;

    @Query
    @NameInMap("EventUuid")
    private String eventUuid;

    @Query
    @NameInMap("IsIgnore")
    private String isIgnore;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("MemberUid")
    private Long memberUid;

    @Query
    @NameInMap("PageSize")
    private String pageSize;

    @Query
    @NameInMap("ProcessStatusList")
    private java.util.List < Integer > processStatusList;

    @Query
    @NameInMap("RiskLevel")
    private java.util.List < Integer > riskLevel;

    @Query
    @NameInMap("SourceIp")
    @Deprecated
    private String sourceIp;

    @Query
    @NameInMap("StartTime")
    private String startTime;

    private DescribeInvadeEventListRequest(Builder builder) {
        super(builder);
        this.assetsIP = builder.assetsIP;
        this.assetsInstanceId = builder.assetsInstanceId;
        this.assetsInstanceName = builder.assetsInstanceName;
        this.currentPage = builder.currentPage;
        this.endTime = builder.endTime;
        this.eventKey = builder.eventKey;
        this.eventName = builder.eventName;
        this.eventUuid = builder.eventUuid;
        this.isIgnore = builder.isIgnore;
        this.lang = builder.lang;
        this.memberUid = builder.memberUid;
        this.pageSize = builder.pageSize;
        this.processStatusList = builder.processStatusList;
        this.riskLevel = builder.riskLevel;
        this.sourceIp = builder.sourceIp;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInvadeEventListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return assetsIP
     */
    public String getAssetsIP() {
        return this.assetsIP;
    }

    /**
     * @return assetsInstanceId
     */
    public String getAssetsInstanceId() {
        return this.assetsInstanceId;
    }

    /**
     * @return assetsInstanceName
     */
    public String getAssetsInstanceName() {
        return this.assetsInstanceName;
    }

    /**
     * @return currentPage
     */
    public String getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return eventKey
     */
    public String getEventKey() {
        return this.eventKey;
    }

    /**
     * @return eventName
     */
    public String getEventName() {
        return this.eventName;
    }

    /**
     * @return eventUuid
     */
    public String getEventUuid() {
        return this.eventUuid;
    }

    /**
     * @return isIgnore
     */
    public String getIsIgnore() {
        return this.isIgnore;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return memberUid
     */
    public Long getMemberUid() {
        return this.memberUid;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return processStatusList
     */
    public java.util.List < Integer > getProcessStatusList() {
        return this.processStatusList;
    }

    /**
     * @return riskLevel
     */
    public java.util.List < Integer > getRiskLevel() {
        return this.riskLevel;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeInvadeEventListRequest, Builder> {
        private String assetsIP; 
        private String assetsInstanceId; 
        private String assetsInstanceName; 
        private String currentPage; 
        private String endTime; 
        private String eventKey; 
        private String eventName; 
        private String eventUuid; 
        private String isIgnore; 
        private String lang; 
        private Long memberUid; 
        private String pageSize; 
        private java.util.List < Integer > processStatusList; 
        private java.util.List < Integer > riskLevel; 
        private String sourceIp; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeInvadeEventListRequest request) {
            super(request);
            this.assetsIP = request.assetsIP;
            this.assetsInstanceId = request.assetsInstanceId;
            this.assetsInstanceName = request.assetsInstanceName;
            this.currentPage = request.currentPage;
            this.endTime = request.endTime;
            this.eventKey = request.eventKey;
            this.eventName = request.eventName;
            this.eventUuid = request.eventUuid;
            this.isIgnore = request.isIgnore;
            this.lang = request.lang;
            this.memberUid = request.memberUid;
            this.pageSize = request.pageSize;
            this.processStatusList = request.processStatusList;
            this.riskLevel = request.riskLevel;
            this.sourceIp = request.sourceIp;
            this.startTime = request.startTime;
        } 

        /**
         * The IP address of the affected asset.
         */
        public Builder assetsIP(String assetsIP) {
            this.putQueryParameter("AssetsIP", assetsIP);
            this.assetsIP = assetsIP;
            return this;
        }

        /**
         * The ID of the instance.
         */
        public Builder assetsInstanceId(String assetsInstanceId) {
            this.putQueryParameter("AssetsInstanceId", assetsInstanceId);
            this.assetsInstanceId = assetsInstanceId;
            return this;
        }

        /**
         * The name of the instance.
         */
        public Builder assetsInstanceName(String assetsInstanceName) {
            this.putQueryParameter("AssetsInstanceName", assetsInstanceName);
            this.assetsInstanceName = assetsInstanceName;
            return this;
        }

        /**
         * The number of the page to return.
         * <p>
         * 
         * Default value: 1.
         */
        public Builder currentPage(String currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The end of the time range to query. The value is a UNIX timestamp. Unit: seconds. If you do not specify this parameter, the query ends at the current time.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The ID of the breach awareness event.
         */
        public Builder eventKey(String eventKey) {
            this.putQueryParameter("EventKey", eventKey);
            this.eventKey = eventKey;
            return this;
        }

        /**
         * The name of the breach awareness event.
         */
        public Builder eventName(String eventName) {
            this.putQueryParameter("EventName", eventName);
            this.eventName = eventName;
            return this;
        }

        /**
         * The UUID of the breach awareness event.
         */
        public Builder eventUuid(String eventUuid) {
            this.putQueryParameter("EventUuid", eventUuid);
            this.eventUuid = eventUuid;
            return this;
        }

        /**
         * Specifies whether the breach awareness event is ignored. Valid values:
         * <p>
         * 
         * *   **true**: The breach awareness event is ignored.
         * *   **false**: The breach awareness event is not ignored.
         */
        public Builder isIgnore(String isIgnore) {
            this.putQueryParameter("IsIgnore", isIgnore);
            this.isIgnore = isIgnore;
            return this;
        }

        /**
         * The language of the content within the response. Valid values:
         * <p>
         * 
         * *   **zh**: Chinese (default)
         * *   **en**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The ID of the member.
         */
        public Builder memberUid(Long memberUid) {
            this.putQueryParameter("MemberUid", memberUid);
            this.memberUid = memberUid;
            return this;
        }

        /**
         * The number of entries to return on each page.
         * <p>
         * 
         * Default value: 6. Maximum value: 10.
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The handling status of breach awareness events.
         */
        public Builder processStatusList(java.util.List < Integer > processStatusList) {
            this.putQueryParameter("ProcessStatusList", processStatusList);
            this.processStatusList = processStatusList;
            return this;
        }

        /**
         * The risk levels.
         */
        public Builder riskLevel(java.util.List < Integer > riskLevel) {
            this.putQueryParameter("RiskLevel", riskLevel);
            this.riskLevel = riskLevel;
            return this;
        }

        /**
         * The source IP address of the request.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * The beginning of the time range to query. The value is a UNIX timestamp. Unit: seconds. If you do not specify this parameter, the query starts from 30 days before the current time.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeInvadeEventListRequest build() {
            return new DescribeInvadeEventListRequest(this);
        } 

    } 

}

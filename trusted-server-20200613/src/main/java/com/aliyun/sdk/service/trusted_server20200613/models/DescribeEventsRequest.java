// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trusted_server20200613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEventsRequest} extends {@link RequestModel}
 *
 * <p>DescribeEventsRequest</p>
 */
public class DescribeEventsRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("CreateEndDate")
    private Long createEndDate;

    @Query
    @NameInMap("CreateStartDate")
    private Long createStartDate;

    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("EventAffiliation")
    private Integer eventAffiliation;

    @Query
    @NameInMap("EventLevel")
    private Integer eventLevel;

    @Query
    @NameInMap("EventStatus")
    private Integer eventStatus;

    @Query
    @NameInMap("EventType")
    private Integer eventType;

    @Query
    @NameInMap("HandleEndDate")
    private Long handleEndDate;

    @Query
    @NameInMap("HandleStartDate")
    private Long handleStartDate;

    @Query
    @NameInMap("HandleType")
    private Integer handleType;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("PropertyName")
    private String propertyName;

    @Query
    @NameInMap("PropertyPrivateIp")
    private String propertyPrivateIp;

    @Query
    @NameInMap("PropertyPublicIp")
    private String propertyPublicIp;

    @Query
    @NameInMap("PropertyUuid")
    private String propertyUuid;

    @Query
    @NameInMap("Suspect")
    private String suspect;

    @Query
    @NameInMap("SuspectSig")
    private String suspectSig;

    private DescribeEventsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.createEndDate = builder.createEndDate;
        this.createStartDate = builder.createStartDate;
        this.currentPage = builder.currentPage;
        this.eventAffiliation = builder.eventAffiliation;
        this.eventLevel = builder.eventLevel;
        this.eventStatus = builder.eventStatus;
        this.eventType = builder.eventType;
        this.handleEndDate = builder.handleEndDate;
        this.handleStartDate = builder.handleStartDate;
        this.handleType = builder.handleType;
        this.pageSize = builder.pageSize;
        this.propertyName = builder.propertyName;
        this.propertyPrivateIp = builder.propertyPrivateIp;
        this.propertyPublicIp = builder.propertyPublicIp;
        this.propertyUuid = builder.propertyUuid;
        this.suspect = builder.suspect;
        this.suspectSig = builder.suspectSig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEventsRequest create() {
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
     * @return createEndDate
     */
    public Long getCreateEndDate() {
        return this.createEndDate;
    }

    /**
     * @return createStartDate
     */
    public Long getCreateStartDate() {
        return this.createStartDate;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return eventAffiliation
     */
    public Integer getEventAffiliation() {
        return this.eventAffiliation;
    }

    /**
     * @return eventLevel
     */
    public Integer getEventLevel() {
        return this.eventLevel;
    }

    /**
     * @return eventStatus
     */
    public Integer getEventStatus() {
        return this.eventStatus;
    }

    /**
     * @return eventType
     */
    public Integer getEventType() {
        return this.eventType;
    }

    /**
     * @return handleEndDate
     */
    public Long getHandleEndDate() {
        return this.handleEndDate;
    }

    /**
     * @return handleStartDate
     */
    public Long getHandleStartDate() {
        return this.handleStartDate;
    }

    /**
     * @return handleType
     */
    public Integer getHandleType() {
        return this.handleType;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return propertyName
     */
    public String getPropertyName() {
        return this.propertyName;
    }

    /**
     * @return propertyPrivateIp
     */
    public String getPropertyPrivateIp() {
        return this.propertyPrivateIp;
    }

    /**
     * @return propertyPublicIp
     */
    public String getPropertyPublicIp() {
        return this.propertyPublicIp;
    }

    /**
     * @return propertyUuid
     */
    public String getPropertyUuid() {
        return this.propertyUuid;
    }

    /**
     * @return suspect
     */
    public String getSuspect() {
        return this.suspect;
    }

    /**
     * @return suspectSig
     */
    public String getSuspectSig() {
        return this.suspectSig;
    }

    public static final class Builder extends Request.Builder<DescribeEventsRequest, Builder> {
        private String regionId; 
        private Long createEndDate; 
        private Long createStartDate; 
        private Integer currentPage; 
        private Integer eventAffiliation; 
        private Integer eventLevel; 
        private Integer eventStatus; 
        private Integer eventType; 
        private Long handleEndDate; 
        private Long handleStartDate; 
        private Integer handleType; 
        private Integer pageSize; 
        private String propertyName; 
        private String propertyPrivateIp; 
        private String propertyPublicIp; 
        private String propertyUuid; 
        private String suspect; 
        private String suspectSig; 

        private Builder() {
            super();
        } 

        private Builder(DescribeEventsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.createEndDate = request.createEndDate;
            this.createStartDate = request.createStartDate;
            this.currentPage = request.currentPage;
            this.eventAffiliation = request.eventAffiliation;
            this.eventLevel = request.eventLevel;
            this.eventStatus = request.eventStatus;
            this.eventType = request.eventType;
            this.handleEndDate = request.handleEndDate;
            this.handleStartDate = request.handleStartDate;
            this.handleType = request.handleType;
            this.pageSize = request.pageSize;
            this.propertyName = request.propertyName;
            this.propertyPrivateIp = request.propertyPrivateIp;
            this.propertyPublicIp = request.propertyPublicIp;
            this.propertyUuid = request.propertyUuid;
            this.suspect = request.suspect;
            this.suspectSig = request.suspectSig;
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
         * CreateEndDate.
         */
        public Builder createEndDate(Long createEndDate) {
            this.putQueryParameter("CreateEndDate", createEndDate);
            this.createEndDate = createEndDate;
            return this;
        }

        /**
         * CreateStartDate.
         */
        public Builder createStartDate(Long createStartDate) {
            this.putQueryParameter("CreateStartDate", createStartDate);
            this.createStartDate = createStartDate;
            return this;
        }

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * EventAffiliation.
         */
        public Builder eventAffiliation(Integer eventAffiliation) {
            this.putQueryParameter("EventAffiliation", eventAffiliation);
            this.eventAffiliation = eventAffiliation;
            return this;
        }

        /**
         * EventLevel.
         */
        public Builder eventLevel(Integer eventLevel) {
            this.putQueryParameter("EventLevel", eventLevel);
            this.eventLevel = eventLevel;
            return this;
        }

        /**
         * EventStatus.
         */
        public Builder eventStatus(Integer eventStatus) {
            this.putQueryParameter("EventStatus", eventStatus);
            this.eventStatus = eventStatus;
            return this;
        }

        /**
         * EventType.
         */
        public Builder eventType(Integer eventType) {
            this.putQueryParameter("EventType", eventType);
            this.eventType = eventType;
            return this;
        }

        /**
         * HandleEndDate.
         */
        public Builder handleEndDate(Long handleEndDate) {
            this.putQueryParameter("HandleEndDate", handleEndDate);
            this.handleEndDate = handleEndDate;
            return this;
        }

        /**
         * HandleStartDate.
         */
        public Builder handleStartDate(Long handleStartDate) {
            this.putQueryParameter("HandleStartDate", handleStartDate);
            this.handleStartDate = handleStartDate;
            return this;
        }

        /**
         * HandleType.
         */
        public Builder handleType(Integer handleType) {
            this.putQueryParameter("HandleType", handleType);
            this.handleType = handleType;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * PropertyName.
         */
        public Builder propertyName(String propertyName) {
            this.putQueryParameter("PropertyName", propertyName);
            this.propertyName = propertyName;
            return this;
        }

        /**
         * PropertyPrivateIp.
         */
        public Builder propertyPrivateIp(String propertyPrivateIp) {
            this.putQueryParameter("PropertyPrivateIp", propertyPrivateIp);
            this.propertyPrivateIp = propertyPrivateIp;
            return this;
        }

        /**
         * PropertyPublicIp.
         */
        public Builder propertyPublicIp(String propertyPublicIp) {
            this.putQueryParameter("PropertyPublicIp", propertyPublicIp);
            this.propertyPublicIp = propertyPublicIp;
            return this;
        }

        /**
         * PropertyUuid.
         */
        public Builder propertyUuid(String propertyUuid) {
            this.putQueryParameter("PropertyUuid", propertyUuid);
            this.propertyUuid = propertyUuid;
            return this;
        }

        /**
         * Suspect.
         */
        public Builder suspect(String suspect) {
            this.putQueryParameter("Suspect", suspect);
            this.suspect = suspect;
            return this;
        }

        /**
         * SuspectSig.
         */
        public Builder suspectSig(String suspectSig) {
            this.putQueryParameter("SuspectSig", suspectSig);
            this.suspectSig = suspectSig;
            return this;
        }

        @Override
        public DescribeEventsRequest build() {
            return new DescribeEventsRequest(this);
        } 

    } 

}

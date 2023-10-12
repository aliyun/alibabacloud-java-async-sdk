// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAlarmStatusStatisticsRequest} extends {@link RequestModel}
 *
 * <p>ListAlarmStatusStatisticsRequest</p>
 */
public class ListAlarmStatusStatisticsRequest extends Request {
    @Query
    @NameInMap("AlarmStatus")
    private String alarmStatus;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("MaxResults")
    @Validation(required = true, maximum = 100, minimum = 1)
    private Integer maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("PhysicalSpaceId")
    private String physicalSpaceId;

    @Query
    @NameInMap("SecurityDomain")
    private String securityDomain;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    private ListAlarmStatusStatisticsRequest(Builder builder) {
        super(builder);
        this.alarmStatus = builder.alarmStatus;
        this.instanceId = builder.instanceId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.physicalSpaceId = builder.physicalSpaceId;
        this.securityDomain = builder.securityDomain;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAlarmStatusStatisticsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alarmStatus
     */
    public String getAlarmStatus() {
        return this.alarmStatus;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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
     * @return physicalSpaceId
     */
    public String getPhysicalSpaceId() {
        return this.physicalSpaceId;
    }

    /**
     * @return securityDomain
     */
    public String getSecurityDomain() {
        return this.securityDomain;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ListAlarmStatusStatisticsRequest, Builder> {
        private String alarmStatus; 
        private String instanceId; 
        private Integer maxResults; 
        private String nextToken; 
        private String physicalSpaceId; 
        private String securityDomain; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ListAlarmStatusStatisticsRequest request) {
            super(request);
            this.alarmStatus = request.alarmStatus;
            this.instanceId = request.instanceId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.physicalSpaceId = request.physicalSpaceId;
            this.securityDomain = request.securityDomain;
            this.type = request.type;
        } 

        /**
         * AlarmStatus.
         */
        public Builder alarmStatus(String alarmStatus) {
            this.putQueryParameter("AlarmStatus", alarmStatus);
            this.alarmStatus = alarmStatus;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * PhysicalSpaceId.
         */
        public Builder physicalSpaceId(String physicalSpaceId) {
            this.putQueryParameter("PhysicalSpaceId", physicalSpaceId);
            this.physicalSpaceId = physicalSpaceId;
            return this;
        }

        /**
         * SecurityDomain.
         */
        public Builder securityDomain(String securityDomain) {
            this.putQueryParameter("SecurityDomain", securityDomain);
            this.securityDomain = securityDomain;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public ListAlarmStatusStatisticsRequest build() {
            return new ListAlarmStatusStatisticsRequest(this);
        } 

    } 

}

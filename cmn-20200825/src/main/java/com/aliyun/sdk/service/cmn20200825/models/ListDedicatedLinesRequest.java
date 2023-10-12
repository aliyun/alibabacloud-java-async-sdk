// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDedicatedLinesRequest} extends {@link RequestModel}
 *
 * <p>ListDedicatedLinesRequest</p>
 */
public class ListDedicatedLinesRequest extends Request {
    @Query
    @NameInMap("Bandwidth")
    private Integer bandwidth;

    @Query
    @NameInMap("DedicatedLineGateway")
    private String dedicatedLineGateway;

    @Query
    @NameInMap("DedicatedLineIp")
    private String dedicatedLineIp;

    @Query
    @NameInMap("DedicatedLineRole")
    private String dedicatedLineRole;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("DeviceId")
    private String deviceId;

    @Query
    @NameInMap("DeviceName")
    private String deviceName;

    @Query
    @NameInMap("DevicePort")
    private String devicePort;

    @Query
    @NameInMap("ExpirationDate")
    private String expirationDate;

    @Query
    @NameInMap("ExtAttributes")
    private String extAttributes;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("Isp")
    private String isp;

    @Query
    @NameInMap("IspFormId")
    private String ispFormId;

    @Query
    @NameInMap("IspId")
    private String ispId;

    @Query
    @NameInMap("Keyword")
    private String keyword;

    @Query
    @NameInMap("Keywords")
    private String keywords;

    @Query
    @NameInMap("MaxResults")
    private Integer maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("OnlineDate")
    private String onlineDate;

    @Query
    @NameInMap("PhysicalSpaceId")
    private String physicalSpaceId;

    @Query
    @NameInMap("SpaceName")
    private String spaceName;

    private ListDedicatedLinesRequest(Builder builder) {
        super(builder);
        this.bandwidth = builder.bandwidth;
        this.dedicatedLineGateway = builder.dedicatedLineGateway;
        this.dedicatedLineIp = builder.dedicatedLineIp;
        this.dedicatedLineRole = builder.dedicatedLineRole;
        this.description = builder.description;
        this.deviceId = builder.deviceId;
        this.deviceName = builder.deviceName;
        this.devicePort = builder.devicePort;
        this.expirationDate = builder.expirationDate;
        this.extAttributes = builder.extAttributes;
        this.instanceId = builder.instanceId;
        this.isp = builder.isp;
        this.ispFormId = builder.ispFormId;
        this.ispId = builder.ispId;
        this.keyword = builder.keyword;
        this.keywords = builder.keywords;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.onlineDate = builder.onlineDate;
        this.physicalSpaceId = builder.physicalSpaceId;
        this.spaceName = builder.spaceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDedicatedLinesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bandwidth
     */
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    /**
     * @return dedicatedLineGateway
     */
    public String getDedicatedLineGateway() {
        return this.dedicatedLineGateway;
    }

    /**
     * @return dedicatedLineIp
     */
    public String getDedicatedLineIp() {
        return this.dedicatedLineIp;
    }

    /**
     * @return dedicatedLineRole
     */
    public String getDedicatedLineRole() {
        return this.dedicatedLineRole;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return deviceId
     */
    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * @return deviceName
     */
    public String getDeviceName() {
        return this.deviceName;
    }

    /**
     * @return devicePort
     */
    public String getDevicePort() {
        return this.devicePort;
    }

    /**
     * @return expirationDate
     */
    public String getExpirationDate() {
        return this.expirationDate;
    }

    /**
     * @return extAttributes
     */
    public String getExtAttributes() {
        return this.extAttributes;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return isp
     */
    public String getIsp() {
        return this.isp;
    }

    /**
     * @return ispFormId
     */
    public String getIspFormId() {
        return this.ispFormId;
    }

    /**
     * @return ispId
     */
    public String getIspId() {
        return this.ispId;
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
    }

    /**
     * @return keywords
     */
    public String getKeywords() {
        return this.keywords;
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
     * @return onlineDate
     */
    public String getOnlineDate() {
        return this.onlineDate;
    }

    /**
     * @return physicalSpaceId
     */
    public String getPhysicalSpaceId() {
        return this.physicalSpaceId;
    }

    /**
     * @return spaceName
     */
    public String getSpaceName() {
        return this.spaceName;
    }

    public static final class Builder extends Request.Builder<ListDedicatedLinesRequest, Builder> {
        private Integer bandwidth; 
        private String dedicatedLineGateway; 
        private String dedicatedLineIp; 
        private String dedicatedLineRole; 
        private String description; 
        private String deviceId; 
        private String deviceName; 
        private String devicePort; 
        private String expirationDate; 
        private String extAttributes; 
        private String instanceId; 
        private String isp; 
        private String ispFormId; 
        private String ispId; 
        private String keyword; 
        private String keywords; 
        private Integer maxResults; 
        private String nextToken; 
        private String onlineDate; 
        private String physicalSpaceId; 
        private String spaceName; 

        private Builder() {
            super();
        } 

        private Builder(ListDedicatedLinesRequest request) {
            super(request);
            this.bandwidth = request.bandwidth;
            this.dedicatedLineGateway = request.dedicatedLineGateway;
            this.dedicatedLineIp = request.dedicatedLineIp;
            this.dedicatedLineRole = request.dedicatedLineRole;
            this.description = request.description;
            this.deviceId = request.deviceId;
            this.deviceName = request.deviceName;
            this.devicePort = request.devicePort;
            this.expirationDate = request.expirationDate;
            this.extAttributes = request.extAttributes;
            this.instanceId = request.instanceId;
            this.isp = request.isp;
            this.ispFormId = request.ispFormId;
            this.ispId = request.ispId;
            this.keyword = request.keyword;
            this.keywords = request.keywords;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.onlineDate = request.onlineDate;
            this.physicalSpaceId = request.physicalSpaceId;
            this.spaceName = request.spaceName;
        } 

        /**
         * Bandwidth.
         */
        public Builder bandwidth(Integer bandwidth) {
            this.putQueryParameter("Bandwidth", bandwidth);
            this.bandwidth = bandwidth;
            return this;
        }

        /**
         * DedicatedLineGateway.
         */
        public Builder dedicatedLineGateway(String dedicatedLineGateway) {
            this.putQueryParameter("DedicatedLineGateway", dedicatedLineGateway);
            this.dedicatedLineGateway = dedicatedLineGateway;
            return this;
        }

        /**
         * DedicatedLineIp.
         */
        public Builder dedicatedLineIp(String dedicatedLineIp) {
            this.putQueryParameter("DedicatedLineIp", dedicatedLineIp);
            this.dedicatedLineIp = dedicatedLineIp;
            return this;
        }

        /**
         * DedicatedLineRole.
         */
        public Builder dedicatedLineRole(String dedicatedLineRole) {
            this.putQueryParameter("DedicatedLineRole", dedicatedLineRole);
            this.dedicatedLineRole = dedicatedLineRole;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * DeviceId.
         */
        public Builder deviceId(String deviceId) {
            this.putQueryParameter("DeviceId", deviceId);
            this.deviceId = deviceId;
            return this;
        }

        /**
         * DeviceName.
         */
        public Builder deviceName(String deviceName) {
            this.putQueryParameter("DeviceName", deviceName);
            this.deviceName = deviceName;
            return this;
        }

        /**
         * DevicePort.
         */
        public Builder devicePort(String devicePort) {
            this.putQueryParameter("DevicePort", devicePort);
            this.devicePort = devicePort;
            return this;
        }

        /**
         * ExpirationDate.
         */
        public Builder expirationDate(String expirationDate) {
            this.putQueryParameter("ExpirationDate", expirationDate);
            this.expirationDate = expirationDate;
            return this;
        }

        /**
         * ExtAttributes.
         */
        public Builder extAttributes(String extAttributes) {
            this.putQueryParameter("ExtAttributes", extAttributes);
            this.extAttributes = extAttributes;
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
         * Isp.
         */
        public Builder isp(String isp) {
            this.putQueryParameter("Isp", isp);
            this.isp = isp;
            return this;
        }

        /**
         * IspFormId.
         */
        public Builder ispFormId(String ispFormId) {
            this.putQueryParameter("IspFormId", ispFormId);
            this.ispFormId = ispFormId;
            return this;
        }

        /**
         * IspId.
         */
        public Builder ispId(String ispId) {
            this.putQueryParameter("IspId", ispId);
            this.ispId = ispId;
            return this;
        }

        /**
         * Keyword.
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * Keywords.
         */
        public Builder keywords(String keywords) {
            this.putQueryParameter("Keywords", keywords);
            this.keywords = keywords;
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
         * OnlineDate.
         */
        public Builder onlineDate(String onlineDate) {
            this.putQueryParameter("OnlineDate", onlineDate);
            this.onlineDate = onlineDate;
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
         * SpaceName.
         */
        public Builder spaceName(String spaceName) {
            this.putQueryParameter("SpaceName", spaceName);
            this.spaceName = spaceName;
            return this;
        }

        @Override
        public ListDedicatedLinesRequest build() {
            return new ListDedicatedLinesRequest(this);
        } 

    } 

}

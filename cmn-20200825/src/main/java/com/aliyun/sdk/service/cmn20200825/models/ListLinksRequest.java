// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListLinksRequest} extends {@link RequestModel}
 *
 * <p>ListLinksRequest</p>
 */
public class ListLinksRequest extends Request {
    @Query
    @NameInMap("DeviceNameA")
    private String deviceNameA;

    @Query
    @NameInMap("DeviceNameB")
    private String deviceNameB;

    @Query
    @NameInMap("IpA")
    private String ipA;

    @Query
    @NameInMap("IpB")
    private String ipB;

    @Query
    @NameInMap("LinkName")
    private String linkName;

    @Query
    @NameInMap("LinkNo")
    private String linkNo;

    @Query
    @NameInMap("LinkStatus")
    private String linkStatus;

    @Query
    @NameInMap("LinkType")
    private String linkType;

    @Query
    @NameInMap("MaxResults")
    @Validation(required = true)
    private Integer maxResults;

    @Query
    @NameInMap("NextToken")
    @Validation(required = true)
    private String nextToken;

    @Query
    @NameInMap("PortA")
    private String portA;

    @Query
    @NameInMap("PortB")
    private String portB;

    private ListLinksRequest(Builder builder) {
        super(builder);
        this.deviceNameA = builder.deviceNameA;
        this.deviceNameB = builder.deviceNameB;
        this.ipA = builder.ipA;
        this.ipB = builder.ipB;
        this.linkName = builder.linkName;
        this.linkNo = builder.linkNo;
        this.linkStatus = builder.linkStatus;
        this.linkType = builder.linkType;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.portA = builder.portA;
        this.portB = builder.portB;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLinksRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deviceNameA
     */
    public String getDeviceNameA() {
        return this.deviceNameA;
    }

    /**
     * @return deviceNameB
     */
    public String getDeviceNameB() {
        return this.deviceNameB;
    }

    /**
     * @return ipA
     */
    public String getIpA() {
        return this.ipA;
    }

    /**
     * @return ipB
     */
    public String getIpB() {
        return this.ipB;
    }

    /**
     * @return linkName
     */
    public String getLinkName() {
        return this.linkName;
    }

    /**
     * @return linkNo
     */
    public String getLinkNo() {
        return this.linkNo;
    }

    /**
     * @return linkStatus
     */
    public String getLinkStatus() {
        return this.linkStatus;
    }

    /**
     * @return linkType
     */
    public String getLinkType() {
        return this.linkType;
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
     * @return portA
     */
    public String getPortA() {
        return this.portA;
    }

    /**
     * @return portB
     */
    public String getPortB() {
        return this.portB;
    }

    public static final class Builder extends Request.Builder<ListLinksRequest, Builder> {
        private String deviceNameA; 
        private String deviceNameB; 
        private String ipA; 
        private String ipB; 
        private String linkName; 
        private String linkNo; 
        private String linkStatus; 
        private String linkType; 
        private Integer maxResults; 
        private String nextToken; 
        private String portA; 
        private String portB; 

        private Builder() {
            super();
        } 

        private Builder(ListLinksRequest request) {
            super(request);
            this.deviceNameA = request.deviceNameA;
            this.deviceNameB = request.deviceNameB;
            this.ipA = request.ipA;
            this.ipB = request.ipB;
            this.linkName = request.linkName;
            this.linkNo = request.linkNo;
            this.linkStatus = request.linkStatus;
            this.linkType = request.linkType;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.portA = request.portA;
            this.portB = request.portB;
        } 

        /**
         * DeviceNameA.
         */
        public Builder deviceNameA(String deviceNameA) {
            this.putQueryParameter("DeviceNameA", deviceNameA);
            this.deviceNameA = deviceNameA;
            return this;
        }

        /**
         * DeviceNameB.
         */
        public Builder deviceNameB(String deviceNameB) {
            this.putQueryParameter("DeviceNameB", deviceNameB);
            this.deviceNameB = deviceNameB;
            return this;
        }

        /**
         * IpA.
         */
        public Builder ipA(String ipA) {
            this.putQueryParameter("IpA", ipA);
            this.ipA = ipA;
            return this;
        }

        /**
         * IpB.
         */
        public Builder ipB(String ipB) {
            this.putQueryParameter("IpB", ipB);
            this.ipB = ipB;
            return this;
        }

        /**
         * LinkName.
         */
        public Builder linkName(String linkName) {
            this.putQueryParameter("LinkName", linkName);
            this.linkName = linkName;
            return this;
        }

        /**
         * LinkNo.
         */
        public Builder linkNo(String linkNo) {
            this.putQueryParameter("LinkNo", linkNo);
            this.linkNo = linkNo;
            return this;
        }

        /**
         * LinkStatus.
         */
        public Builder linkStatus(String linkStatus) {
            this.putQueryParameter("LinkStatus", linkStatus);
            this.linkStatus = linkStatus;
            return this;
        }

        /**
         * LinkType.
         */
        public Builder linkType(String linkType) {
            this.putQueryParameter("LinkType", linkType);
            this.linkType = linkType;
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
         * PortA.
         */
        public Builder portA(String portA) {
            this.putQueryParameter("PortA", portA);
            this.portA = portA;
            return this;
        }

        /**
         * PortB.
         */
        public Builder portB(String portB) {
            this.putQueryParameter("PortB", portB);
            this.portB = portB;
            return this;
        }

        @Override
        public ListLinksRequest build() {
            return new ListLinksRequest(this);
        } 

    } 

}

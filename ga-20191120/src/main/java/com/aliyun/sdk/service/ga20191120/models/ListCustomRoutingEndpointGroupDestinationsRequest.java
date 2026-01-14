// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

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
 * {@link ListCustomRoutingEndpointGroupDestinationsRequest} extends {@link RequestModel}
 *
 * <p>ListCustomRoutingEndpointGroupDestinationsRequest</p>
 */
public class ListCustomRoutingEndpointGroupDestinationsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceleratorId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String acceleratorId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndpointGroupId")
    private String endpointGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FromPort")
    private Integer fromPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ListenerId")
    private String listenerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 50, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Protocols")
    private java.util.List<String> protocols;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ToPort")
    private Integer toPort;

    private ListCustomRoutingEndpointGroupDestinationsRequest(Builder builder) {
        super(builder);
        this.acceleratorId = builder.acceleratorId;
        this.endpointGroupId = builder.endpointGroupId;
        this.fromPort = builder.fromPort;
        this.listenerId = builder.listenerId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.protocols = builder.protocols;
        this.regionId = builder.regionId;
        this.toPort = builder.toPort;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCustomRoutingEndpointGroupDestinationsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceleratorId
     */
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    /**
     * @return endpointGroupId
     */
    public String getEndpointGroupId() {
        return this.endpointGroupId;
    }

    /**
     * @return fromPort
     */
    public Integer getFromPort() {
        return this.fromPort;
    }

    /**
     * @return listenerId
     */
    public String getListenerId() {
        return this.listenerId;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return protocols
     */
    public java.util.List<String> getProtocols() {
        return this.protocols;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return toPort
     */
    public Integer getToPort() {
        return this.toPort;
    }

    public static final class Builder extends Request.Builder<ListCustomRoutingEndpointGroupDestinationsRequest, Builder> {
        private String acceleratorId; 
        private String endpointGroupId; 
        private Integer fromPort; 
        private String listenerId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private java.util.List<String> protocols; 
        private String regionId; 
        private Integer toPort; 

        private Builder() {
            super();
        } 

        private Builder(ListCustomRoutingEndpointGroupDestinationsRequest request) {
            super(request);
            this.acceleratorId = request.acceleratorId;
            this.endpointGroupId = request.endpointGroupId;
            this.fromPort = request.fromPort;
            this.listenerId = request.listenerId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.protocols = request.protocols;
            this.regionId = request.regionId;
            this.toPort = request.toPort;
        } 

        /**
         * <p>The ID of the GA instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ga-bp1odcab8tmno0hdq****</p>
         */
        public Builder acceleratorId(String acceleratorId) {
            this.putQueryParameter("AcceleratorId", acceleratorId);
            this.acceleratorId = acceleratorId;
            return this;
        }

        /**
         * <p>The ID of the endpoint group.</p>
         * 
         * <strong>example:</strong>
         * <p>epg-bp16jdc00bhe97sr5****</p>
         */
        public Builder endpointGroupId(String endpointGroupId) {
            this.putQueryParameter("EndpointGroupId", endpointGroupId);
            this.endpointGroupId = endpointGroupId;
            return this;
        }

        /**
         * <p>The start port of the backend service port range of the endpoint group.</p>
         * <p>Valid values: <strong>1</strong> to <strong>65499</strong>. The <strong>FromPort</strong> value must be smaller than or equal to the <strong>ToPort</strong> value.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        public Builder fromPort(Integer fromPort) {
            this.putQueryParameter("FromPort", fromPort);
            this.fromPort = fromPort;
            return this;
        }

        /**
         * <p>The ID of the listener.</p>
         * 
         * <strong>example:</strong>
         * <p>lsr-bp1bpn0kn908w4nbw****</p>
         */
        public Builder listenerId(String listenerId) {
            this.putQueryParameter("ListenerId", listenerId);
            this.listenerId = listenerId;
            return this;
        }

        /**
         * <p>The page number. Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Maximum value: <strong>50</strong>. Default value: <strong>10</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The backend service protocols of the endpoint group. Valid values:</p>
         * <ul>
         * <li><strong>TCP</strong>: TCP.</li>
         * <li><strong>UDP</strong>: UDP.</li>
         * <li><strong>TCP,UDP</strong>: TCP and UDP.</li>
         * </ul>
         * <p>If this parameter is empty, all types of protocols are queried.</p>
         * <p>You can specify up to 10 protocols.</p>
         */
        public Builder protocols(java.util.List<String> protocols) {
            this.putQueryParameter("Protocols", protocols);
            this.protocols = protocols;
            return this;
        }

        /**
         * <p>The region ID of the GA instance. Set the value to <strong>cn-hangzhou</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The end port of the backend service port range of the endpoint group.</p>
         * <p>Valid values: <strong>1</strong> to <strong>65499</strong>. The <strong>FromPort</strong> value must be smaller than or equal to the <strong>ToPort</strong> value.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        public Builder toPort(Integer toPort) {
            this.putQueryParameter("ToPort", toPort);
            this.toPort = toPort;
            return this;
        }

        @Override
        public ListCustomRoutingEndpointGroupDestinationsRequest build() {
            return new ListCustomRoutingEndpointGroupDestinationsRequest(this);
        } 

    } 

}

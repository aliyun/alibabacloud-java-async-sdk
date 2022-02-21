// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetBasicEndpointGroupResponseBody} extends {@link TeaModel}
 *
 * <p>GetBasicEndpointGroupResponseBody</p>
 */
public class GetBasicEndpointGroupResponseBody extends TeaModel {
    @NameInMap("AcceleratorId")
    private String acceleratorId;

    @NameInMap("Description")
    private String description;

    @NameInMap("EndpointAddress")
    private String endpointAddress;

    @NameInMap("EndpointGroupId")
    private String endpointGroupId;

    @NameInMap("EndpointGroupRegion")
    private String endpointGroupRegion;

    @NameInMap("EndpointType")
    private String endpointType;

    @NameInMap("Name")
    private String name;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("State")
    private String state;

    private GetBasicEndpointGroupResponseBody(Builder builder) {
        this.acceleratorId = builder.acceleratorId;
        this.description = builder.description;
        this.endpointAddress = builder.endpointAddress;
        this.endpointGroupId = builder.endpointGroupId;
        this.endpointGroupRegion = builder.endpointGroupRegion;
        this.endpointType = builder.endpointType;
        this.name = builder.name;
        this.requestId = builder.requestId;
        this.state = builder.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBasicEndpointGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return acceleratorId
     */
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return endpointAddress
     */
    public String getEndpointAddress() {
        return this.endpointAddress;
    }

    /**
     * @return endpointGroupId
     */
    public String getEndpointGroupId() {
        return this.endpointGroupId;
    }

    /**
     * @return endpointGroupRegion
     */
    public String getEndpointGroupRegion() {
        return this.endpointGroupRegion;
    }

    /**
     * @return endpointType
     */
    public String getEndpointType() {
        return this.endpointType;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    public static final class Builder {
        private String acceleratorId; 
        private String description; 
        private String endpointAddress; 
        private String endpointGroupId; 
        private String endpointGroupRegion; 
        private String endpointType; 
        private String name; 
        private String requestId; 
        private String state; 

        /**
         * 全球加速实例Id
         */
        public Builder acceleratorId(String acceleratorId) {
            this.acceleratorId = acceleratorId;
            return this;
        }

        /**
         * 终端节点组描述
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * 终端节点组地址
         */
        public Builder endpointAddress(String endpointAddress) {
            this.endpointAddress = endpointAddress;
            return this;
        }

        /**
         * 终端节点组Id
         */
        public Builder endpointGroupId(String endpointGroupId) {
            this.endpointGroupId = endpointGroupId;
            return this;
        }

        /**
         * 终端节点组所在地域
         */
        public Builder endpointGroupRegion(String endpointGroupRegion) {
            this.endpointGroupRegion = endpointGroupRegion;
            return this;
        }

        /**
         * 终端节点类型
         */
        public Builder endpointType(String endpointType) {
            this.endpointType = endpointType;
            return this;
        }

        /**
         * 终端节点组名称
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * 请求Id
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 终端节点组状态
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        public GetBasicEndpointGroupResponseBody build() {
            return new GetBasicEndpointGroupResponseBody(this);
        } 

    } 

}

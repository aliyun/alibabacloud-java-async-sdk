// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSlbAPsRequest} extends {@link RequestModel}
 *
 * <p>ListSlbAPsRequest</p>
 */
public class ListSlbAPsRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private Long appId;

    @Query
    @NameInMap("EnvId")
    private Long envId;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("NetworkMode")
    private String networkMode;

    @Query
    @NameInMap("PageNumber")
    @Validation(required = true)
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true)
    private Integer pageSize;

    @Body
    @NameInMap("ProtocolList")
    private java.util.List < String > protocolList;

    @Query
    @NameInMap("SlbId")
    private String slbId;

    private ListSlbAPsRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.envId = builder.envId;
        this.name = builder.name;
        this.networkMode = builder.networkMode;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.protocolList = builder.protocolList;
        this.slbId = builder.slbId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSlbAPsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public Long getAppId() {
        return this.appId;
    }

    /**
     * @return envId
     */
    public Long getEnvId() {
        return this.envId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return networkMode
     */
    public String getNetworkMode() {
        return this.networkMode;
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
     * @return protocolList
     */
    public java.util.List < String > getProtocolList() {
        return this.protocolList;
    }

    /**
     * @return slbId
     */
    public String getSlbId() {
        return this.slbId;
    }

    public static final class Builder extends Request.Builder<ListSlbAPsRequest, Builder> {
        private Long appId; 
        private Long envId; 
        private String name; 
        private String networkMode; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private java.util.List < String > protocolList; 
        private String slbId; 

        private Builder() {
            super();
        } 

        private Builder(ListSlbAPsRequest request) {
            super(request);
            this.appId = request.appId;
            this.envId = request.envId;
            this.name = request.name;
            this.networkMode = request.networkMode;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.protocolList = request.protocolList;
            this.slbId = request.slbId;
        } 

        /**
         * AppId.
         */
        public Builder appId(Long appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * EnvId.
         */
        public Builder envId(Long envId) {
            this.putQueryParameter("EnvId", envId);
            this.envId = envId;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * NetworkMode.
         */
        public Builder networkMode(String networkMode) {
            this.putQueryParameter("NetworkMode", networkMode);
            this.networkMode = networkMode;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
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
         * ProtocolList.
         */
        public Builder protocolList(java.util.List < String > protocolList) {
            this.putBodyParameter("ProtocolList", protocolList);
            this.protocolList = protocolList;
            return this;
        }

        /**
         * SlbId.
         */
        public Builder slbId(String slbId) {
            this.putQueryParameter("SlbId", slbId);
            this.slbId = slbId;
            return this;
        }

        @Override
        public ListSlbAPsRequest build() {
            return new ListSlbAPsRequest(this);
        } 

    } 

}

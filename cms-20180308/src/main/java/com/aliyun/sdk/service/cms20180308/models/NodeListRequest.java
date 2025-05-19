// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20180308.models;

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
 * {@link NodeListRequest} extends {@link RequestModel}
 *
 * <p>NodeListRequest</p>
 */
public class NodeListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HostName")
    private String hostName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    private String instanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceRegionId")
    private String instanceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyWord")
    private String keyWord;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SerialNumbers")
    private String serialNumbers;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long userId;

    private NodeListRequest(Builder builder) {
        super(builder);
        this.hostName = builder.hostName;
        this.instanceIds = builder.instanceIds;
        this.instanceRegionId = builder.instanceRegionId;
        this.keyWord = builder.keyWord;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.serialNumbers = builder.serialNumbers;
        this.status = builder.status;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static NodeListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return hostName
     */
    public String getHostName() {
        return this.hostName;
    }

    /**
     * @return instanceIds
     */
    public String getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return instanceRegionId
     */
    public String getInstanceRegionId() {
        return this.instanceRegionId;
    }

    /**
     * @return keyWord
     */
    public String getKeyWord() {
        return this.keyWord;
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
     * @return serialNumbers
     */
    public String getSerialNumbers() {
        return this.serialNumbers;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return userId
     */
    public Long getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<NodeListRequest, Builder> {
        private String hostName; 
        private String instanceIds; 
        private String instanceRegionId; 
        private String keyWord; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String serialNumbers; 
        private String status; 
        private Long userId; 

        private Builder() {
            super();
        } 

        private Builder(NodeListRequest request) {
            super(request);
            this.hostName = request.hostName;
            this.instanceIds = request.instanceIds;
            this.instanceRegionId = request.instanceRegionId;
            this.keyWord = request.keyWord;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.serialNumbers = request.serialNumbers;
            this.status = request.status;
            this.userId = request.userId;
        } 

        /**
         * HostName.
         */
        public Builder hostName(String hostName) {
            this.putQueryParameter("HostName", hostName);
            this.hostName = hostName;
            return this;
        }

        /**
         * InstanceIds.
         */
        public Builder instanceIds(String instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * InstanceRegionId.
         */
        public Builder instanceRegionId(String instanceRegionId) {
            this.putQueryParameter("InstanceRegionId", instanceRegionId);
            this.instanceRegionId = instanceRegionId;
            return this;
        }

        /**
         * KeyWord.
         */
        public Builder keyWord(String keyWord) {
            this.putQueryParameter("KeyWord", keyWord);
            this.keyWord = keyWord;
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
         * SerialNumbers.
         */
        public Builder serialNumbers(String serialNumbers) {
            this.putQueryParameter("SerialNumbers", serialNumbers);
            this.serialNumbers = serialNumbers;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder userId(Long userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public NodeListRequest build() {
            return new NodeListRequest(this);
        } 

    } 

}

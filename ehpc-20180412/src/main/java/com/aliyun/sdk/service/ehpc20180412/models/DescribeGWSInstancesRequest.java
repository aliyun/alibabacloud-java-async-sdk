// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGWSInstancesRequest} extends {@link RequestModel}
 *
 * <p>DescribeGWSInstancesRequest</p>
 */
public class DescribeGWSInstancesRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    private String clusterId;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 50)
    private Integer pageSize;

    @Query
    @NameInMap("UserName")
    private String userName;

    @Query
    @NameInMap("UserUid")
    private Long userUid;

    private DescribeGWSInstancesRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.instanceId = builder.instanceId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.userName = builder.userName;
        this.userUid = builder.userUid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGWSInstancesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    /**
     * @return userUid
     */
    public Long getUserUid() {
        return this.userUid;
    }

    public static final class Builder extends Request.Builder<DescribeGWSInstancesRequest, Builder> {
        private String clusterId; 
        private String instanceId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String userName; 
        private Long userUid; 

        private Builder() {
            super();
        } 

        private Builder(DescribeGWSInstancesRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.instanceId = request.instanceId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.userName = request.userName;
            this.userUid = request.userUid;
        } 

        /**
         * The ID of the visualization service.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The ID of the visualization instance.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The page number of the page to return.
         * <p>
         * 
         * Pages start from page 1.
         * 
         * Default value: 1.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries to return on each page. Valid values: 1 to 50.
         * <p>
         * 
         * Default value: 10.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The username of the entity whose instances you want to query.
         * <p>
         * 
         * >  If this parameter is not specified, instances of all users are queried.
         */
        public Builder userName(String userName) {
            this.putQueryParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        /**
         * The user ID of the entity whose instances you want to query.
         * <p>
         * 
         * >  If this parameter is not specified, instances of all users are queried.
         */
        public Builder userUid(Long userUid) {
            this.putQueryParameter("UserUid", userUid);
            this.userUid = userUid;
            return this;
        }

        @Override
        public DescribeGWSInstancesRequest build() {
            return new DescribeGWSInstancesRequest(this);
        } 

    } 

}

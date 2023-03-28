// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pts20201020.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEnvsRequest} extends {@link RequestModel}
 *
 * <p>ListEnvsRequest</p>
 */
public class ListEnvsRequest extends Request {
    @Query
    @NameInMap("EnvId")
    private String envId;

    @Query
    @NameInMap("EnvName")
    private String envName;

    @Query
    @NameInMap("PageNumber")
    @Validation(required = true, maximum = 10000000, minimum = 1)
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true, maximum = 200, minimum = 5)
    private Integer pageSize;

    private ListEnvsRequest(Builder builder) {
        super(builder);
        this.envId = builder.envId;
        this.envName = builder.envName;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEnvsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return envId
     */
    public String getEnvId() {
        return this.envId;
    }

    /**
     * @return envName
     */
    public String getEnvName() {
        return this.envName;
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

    public static final class Builder extends Request.Builder<ListEnvsRequest, Builder> {
        private String envId; 
        private String envName; 
        private Integer pageNumber; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListEnvsRequest request) {
            super(request);
            this.envId = request.envId;
            this.envName = request.envName;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
        } 

        /**
         * 环境ID
         */
        public Builder envId(String envId) {
            this.putQueryParameter("EnvId", envId);
            this.envId = envId;
            return this;
        }

        /**
         * 环境名
         */
        public Builder envName(String envName) {
            this.putQueryParameter("EnvName", envName);
            this.envName = envName;
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

        @Override
        public ListEnvsRequest build() {
            return new ListEnvsRequest(this);
        } 

    } 

}

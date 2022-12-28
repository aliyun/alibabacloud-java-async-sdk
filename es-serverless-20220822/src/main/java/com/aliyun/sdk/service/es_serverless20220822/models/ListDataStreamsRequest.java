// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.es_serverless20220822.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDataStreamsRequest} extends {@link RequestModel}
 *
 * <p>ListDataStreamsRequest</p>
 */
public class ListDataStreamsRequest extends Request {
    @Path
    @NameInMap("appName")
    @Validation(required = true)
    private String appName;

    @Query
    @NameInMap("dataStreamName")
    private String dataStreamName;

    @Query
    @NameInMap("pageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("pageSize")
    private Integer pageSize;

    @Query
    @NameInMap("regionId")
    private String regionId;

    private ListDataStreamsRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.dataStreamName = builder.dataStreamName;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataStreamsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return dataStreamName
     */
    public String getDataStreamName() {
        return this.dataStreamName;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ListDataStreamsRequest, Builder> {
        private String appName; 
        private String dataStreamName; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListDataStreamsRequest request) {
            super(request);
            this.appName = request.appName;
            this.dataStreamName = request.dataStreamName;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
        } 

        /**
         * appName.
         */
        public Builder appName(String appName) {
            this.putPathParameter("appName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * dataStreamName.
         */
        public Builder dataStreamName(String dataStreamName) {
            this.putQueryParameter("dataStreamName", dataStreamName);
            this.dataStreamName = dataStreamName;
            return this;
        }

        /**
         * pageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ListDataStreamsRequest build() {
            return new ListDataStreamsRequest(this);
        } 

    } 

}

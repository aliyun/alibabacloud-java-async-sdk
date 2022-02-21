// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAppGroupErrorsRequest} extends {@link RequestModel}
 *
 * <p>ListAppGroupErrorsRequest</p>
 */
public class ListAppGroupErrorsRequest extends Request {
    @Path
    @NameInMap("appGroupIdentity")
    @Validation(required = true)
    private String appGroupIdentity;

    @Query
    @NameInMap("appId")
    private String appId;

    @Query
    @NameInMap("pageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("pageSize")
    private Integer pageSize;

    @Query
    @NameInMap("startTime")
    private Integer startTime;

    @Query
    @NameInMap("stopTime")
    private Integer stopTime;

    private ListAppGroupErrorsRequest(Builder builder) {
        super(builder);
        this.appGroupIdentity = builder.appGroupIdentity;
        this.appId = builder.appId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.startTime = builder.startTime;
        this.stopTime = builder.stopTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAppGroupErrorsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appGroupIdentity
     */
    public String getAppGroupIdentity() {
        return this.appGroupIdentity;
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
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
     * @return startTime
     */
    public Integer getStartTime() {
        return this.startTime;
    }

    /**
     * @return stopTime
     */
    public Integer getStopTime() {
        return this.stopTime;
    }

    public static final class Builder extends Request.Builder<ListAppGroupErrorsRequest, Builder> {
        private String appGroupIdentity; 
        private String appId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Integer startTime; 
        private Integer stopTime; 

        private Builder() {
            super();
        } 

        private Builder(ListAppGroupErrorsRequest response) {
            super(response);
            this.appGroupIdentity = response.appGroupIdentity;
            this.appId = response.appId;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.startTime = response.startTime;
            this.stopTime = response.stopTime;
        } 

        /**
         * appGroupIdentity.
         */
        public Builder appGroupIdentity(String appGroupIdentity) {
            this.putPathParameter("appGroupIdentity", appGroupIdentity);
            this.appGroupIdentity = appGroupIdentity;
            return this;
        }

        /**
         * appId.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("appId", appId);
            this.appId = appId;
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
         * startTime.
         */
        public Builder startTime(Integer startTime) {
            this.putQueryParameter("startTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * stopTime.
         */
        public Builder stopTime(Integer stopTime) {
            this.putQueryParameter("stopTime", stopTime);
            this.stopTime = stopTime;
            return this;
        }

        @Override
        public ListAppGroupErrorsRequest build() {
            return new ListAppGroupErrorsRequest(this);
        } 

    } 

}

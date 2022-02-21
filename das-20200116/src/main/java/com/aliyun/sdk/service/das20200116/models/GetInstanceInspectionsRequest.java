// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInstanceInspectionsRequest} extends {@link RequestModel}
 *
 * <p>GetInstanceInspectionsRequest</p>
 */
public class GetInstanceInspectionsRequest extends Request {
    @Query
    @NameInMap("EndTime")
    @Validation(required = true)
    private String endTime;

    @Query
    @NameInMap("Engine")
    @Validation(required = true)
    private String engine;

    @Query
    @NameInMap("InstanceArea")
    @Validation(required = true)
    private String instanceArea;

    @Query
    @NameInMap("PageNo")
    @Validation(required = true)
    private String pageNo;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true)
    private String pageSize;

    @Query
    @NameInMap("SearchMap")
    private String searchMap;

    @Query
    @NameInMap("StartTime")
    @Validation(required = true)
    private String startTime;

    private GetInstanceInspectionsRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.engine = builder.engine;
        this.instanceArea = builder.instanceArea;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.searchMap = builder.searchMap;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceInspectionsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return engine
     */
    public String getEngine() {
        return this.engine;
    }

    /**
     * @return instanceArea
     */
    public String getInstanceArea() {
        return this.instanceArea;
    }

    /**
     * @return pageNo
     */
    public String getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return searchMap
     */
    public String getSearchMap() {
        return this.searchMap;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<GetInstanceInspectionsRequest, Builder> {
        private String endTime; 
        private String engine; 
        private String instanceArea; 
        private String pageNo; 
        private String pageSize; 
        private String searchMap; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(GetInstanceInspectionsRequest response) {
            super(response);
            this.endTime = response.endTime;
            this.engine = response.engine;
            this.instanceArea = response.instanceArea;
            this.pageNo = response.pageNo;
            this.pageSize = response.pageSize;
            this.searchMap = response.searchMap;
            this.startTime = response.startTime;
        } 

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * Engine.
         */
        public Builder engine(String engine) {
            this.putQueryParameter("Engine", engine);
            this.engine = engine;
            return this;
        }

        /**
         * InstanceArea.
         */
        public Builder instanceArea(String instanceArea) {
            this.putQueryParameter("InstanceArea", instanceArea);
            this.instanceArea = instanceArea;
            return this;
        }

        /**
         * PageNo.
         */
        public Builder pageNo(String pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * SearchMap.
         */
        public Builder searchMap(String searchMap) {
            this.putQueryParameter("SearchMap", searchMap);
            this.searchMap = searchMap;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public GetInstanceInspectionsRequest build() {
            return new GetInstanceInspectionsRequest(this);
        } 

    } 

}

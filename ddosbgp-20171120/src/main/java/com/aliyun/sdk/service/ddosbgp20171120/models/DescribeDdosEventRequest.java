// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20171120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDdosEventRequest} extends {@link RequestModel}
 *
 * <p>DescribeDdosEventRequest</p>
 */
public class DescribeDdosEventRequest extends Request {
    @Query
    @NameInMap("EndTime")
    @Validation(required = true)
    private Integer endTime;

    @Query
    @NameInMap("PackId")
    @Validation(required = true)
    private String packId;

    @Query
    @NameInMap("PageNo")
    @Validation(required = true)
    private Integer pageNo;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true)
    private Integer pageSize;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    @Query
    @NameInMap("StartTime")
    @Validation(required = true)
    private Integer startTime;

    private DescribeDdosEventRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.packId = builder.packId;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.sourceIp = builder.sourceIp;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDdosEventRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public Integer getEndTime() {
        return this.endTime;
    }

    /**
     * @return packId
     */
    public String getPackId() {
        return this.packId;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return startTime
     */
    public Integer getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeDdosEventRequest, Builder> {
        private Integer endTime; 
        private String packId; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String sourceIp; 
        private Integer startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDdosEventRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.packId = request.packId;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.sourceIp = request.sourceIp;
            this.startTime = request.startTime;
        } 

        /**
         * EndTime.
         */
        public Builder endTime(Integer endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * PackId.
         */
        public Builder packId(String packId) {
            this.putQueryParameter("PackId", packId);
            this.packId = packId;
            return this;
        }

        /**
         * PageNo.
         */
        public Builder pageNo(Integer pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
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
         * SourceIp.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(Integer startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeDdosEventRequest build() {
            return new DescribeDdosEventRequest(this);
        } 

    } 

}

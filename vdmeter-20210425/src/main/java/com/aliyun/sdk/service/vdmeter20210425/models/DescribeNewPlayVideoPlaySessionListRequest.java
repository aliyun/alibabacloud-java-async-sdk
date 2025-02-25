// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vdmeter20210425.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNewPlayVideoPlaySessionListRequest} extends {@link RequestModel}
 *
 * <p>DescribeNewPlayVideoPlaySessionListRequest</p>
 */
public class DescribeNewPlayVideoPlaySessionListRequest extends Request {
    @Query
    @NameInMap("EndTimeStamp")
    @Validation(required = true)
    private String endTimeStamp;

    @Query
    @NameInMap("InputStatus")
    private String inputStatus;

    @Query
    @NameInMap("Order")
    @Validation(required = true)
    private String order;

    @Query
    @NameInMap("PageNum")
    @Validation(required = true)
    private Integer pageNum;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true)
    private Integer pageSize;

    @Query
    @NameInMap("StartTimeStamp")
    @Validation(required = true)
    private String startTimeStamp;

    @Query
    @NameInMap("UniqueId")
    private String uniqueId;

    private DescribeNewPlayVideoPlaySessionListRequest(Builder builder) {
        super(builder);
        this.endTimeStamp = builder.endTimeStamp;
        this.inputStatus = builder.inputStatus;
        this.order = builder.order;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.startTimeStamp = builder.startTimeStamp;
        this.uniqueId = builder.uniqueId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNewPlayVideoPlaySessionListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTimeStamp
     */
    public String getEndTimeStamp() {
        return this.endTimeStamp;
    }

    /**
     * @return inputStatus
     */
    public String getInputStatus() {
        return this.inputStatus;
    }

    /**
     * @return order
     */
    public String getOrder() {
        return this.order;
    }

    /**
     * @return pageNum
     */
    public Integer getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return startTimeStamp
     */
    public String getStartTimeStamp() {
        return this.startTimeStamp;
    }

    /**
     * @return uniqueId
     */
    public String getUniqueId() {
        return this.uniqueId;
    }

    public static final class Builder extends Request.Builder<DescribeNewPlayVideoPlaySessionListRequest, Builder> {
        private String endTimeStamp; 
        private String inputStatus; 
        private String order; 
        private Integer pageNum; 
        private Integer pageSize; 
        private String startTimeStamp; 
        private String uniqueId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeNewPlayVideoPlaySessionListRequest request) {
            super(request);
            this.endTimeStamp = request.endTimeStamp;
            this.inputStatus = request.inputStatus;
            this.order = request.order;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.startTimeStamp = request.startTimeStamp;
            this.uniqueId = request.uniqueId;
        } 

        /**
         * EndTimeStamp.
         */
        public Builder endTimeStamp(String endTimeStamp) {
            this.putQueryParameter("EndTimeStamp", endTimeStamp);
            this.endTimeStamp = endTimeStamp;
            return this;
        }

        /**
         * InputStatus.
         */
        public Builder inputStatus(String inputStatus) {
            this.putQueryParameter("InputStatus", inputStatus);
            this.inputStatus = inputStatus;
            return this;
        }

        /**
         * Order.
         */
        public Builder order(String order) {
            this.putQueryParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * PageNum.
         */
        public Builder pageNum(Integer pageNum) {
            this.putQueryParameter("PageNum", pageNum);
            this.pageNum = pageNum;
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
         * StartTimeStamp.
         */
        public Builder startTimeStamp(String startTimeStamp) {
            this.putQueryParameter("StartTimeStamp", startTimeStamp);
            this.startTimeStamp = startTimeStamp;
            return this;
        }

        /**
         * UniqueId.
         */
        public Builder uniqueId(String uniqueId) {
            this.putQueryParameter("UniqueId", uniqueId);
            this.uniqueId = uniqueId;
            return this;
        }

        @Override
        public DescribeNewPlayVideoPlaySessionListRequest build() {
            return new DescribeNewPlayVideoPlaySessionListRequest(this);
        } 

    } 

}

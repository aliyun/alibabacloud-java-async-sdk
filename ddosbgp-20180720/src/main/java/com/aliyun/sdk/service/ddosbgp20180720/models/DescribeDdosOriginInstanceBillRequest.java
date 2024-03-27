// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20180720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDdosOriginInstanceBillRequest} extends {@link RequestModel}
 *
 * <p>DescribeDdosOriginInstanceBillRequest</p>
 */
public class DescribeDdosOriginInstanceBillRequest extends Request {
    @Query
    @NameInMap("EndTime")
    private Long endTime;

    @Query
    @NameInMap("IsShowList")
    private Boolean isShowList;

    @Query
    @NameInMap("StartTime")
    private Long startTime;

    @Query
    @NameInMap("Type")
    private String type;

    private DescribeDdosOriginInstanceBillRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.isShowList = builder.isShowList;
        this.startTime = builder.startTime;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDdosOriginInstanceBillRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return isShowList
     */
    public Boolean getIsShowList() {
        return this.isShowList;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<DescribeDdosOriginInstanceBillRequest, Builder> {
        private Long endTime; 
        private Boolean isShowList; 
        private Long startTime; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDdosOriginInstanceBillRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.isShowList = request.isShowList;
            this.startTime = request.startTime;
            this.type = request.type;
        } 

        /**
         * EndTime.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * IsShowList.
         */
        public Builder isShowList(Boolean isShowList) {
            this.putQueryParameter("IsShowList", isShowList);
            this.isShowList = isShowList;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public DescribeDdosOriginInstanceBillRequest build() {
            return new DescribeDdosOriginInstanceBillRequest(this);
        } 

    } 

}

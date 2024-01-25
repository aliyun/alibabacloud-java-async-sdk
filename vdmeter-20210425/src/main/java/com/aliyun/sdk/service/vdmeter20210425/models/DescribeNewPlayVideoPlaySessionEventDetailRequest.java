// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vdmeter20210425.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNewPlayVideoPlaySessionEventDetailRequest} extends {@link RequestModel}
 *
 * <p>DescribeNewPlayVideoPlaySessionEventDetailRequest</p>
 */
public class DescribeNewPlayVideoPlaySessionEventDetailRequest extends Request {
    @Query
    @NameInMap("BizDate")
    private Long bizDate;

    @Query
    @NameInMap("InputStatus")
    private String inputStatus;

    @Query
    @NameInMap("PageNum")
    @Validation(required = true)
    private Integer pageNum;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true)
    private Integer pageSize;

    @Query
    @NameInMap("VPS")
    @Validation(required = true)
    private String VPS;

    private DescribeNewPlayVideoPlaySessionEventDetailRequest(Builder builder) {
        super(builder);
        this.bizDate = builder.bizDate;
        this.inputStatus = builder.inputStatus;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.VPS = builder.VPS;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNewPlayVideoPlaySessionEventDetailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizDate
     */
    public Long getBizDate() {
        return this.bizDate;
    }

    /**
     * @return inputStatus
     */
    public String getInputStatus() {
        return this.inputStatus;
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
     * @return VPS
     */
    public String getVPS() {
        return this.VPS;
    }

    public static final class Builder extends Request.Builder<DescribeNewPlayVideoPlaySessionEventDetailRequest, Builder> {
        private Long bizDate; 
        private String inputStatus; 
        private Integer pageNum; 
        private Integer pageSize; 
        private String VPS; 

        private Builder() {
            super();
        } 

        private Builder(DescribeNewPlayVideoPlaySessionEventDetailRequest request) {
            super(request);
            this.bizDate = request.bizDate;
            this.inputStatus = request.inputStatus;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.VPS = request.VPS;
        } 

        /**
         * BizDate.
         */
        public Builder bizDate(Long bizDate) {
            this.putQueryParameter("BizDate", bizDate);
            this.bizDate = bizDate;
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
         * VPS.
         */
        public Builder VPS(String VPS) {
            this.putQueryParameter("VPS", VPS);
            this.VPS = VPS;
            return this;
        }

        @Override
        public DescribeNewPlayVideoPlaySessionEventDetailRequest build() {
            return new DescribeNewPlayVideoPlaySessionEventDetailRequest(this);
        } 

    } 

}

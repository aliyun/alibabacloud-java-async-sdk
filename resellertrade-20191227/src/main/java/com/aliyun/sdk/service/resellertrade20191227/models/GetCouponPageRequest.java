// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resellertrade20191227.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCouponPageRequest} extends {@link RequestModel}
 *
 * <p>GetCouponPageRequest</p>
 */
public class GetCouponPageRequest extends Request {
    @Query
    @NameInMap("FromApp")
    private String fromApp;

    @Query
    @NameInMap("PageNo")
    private Integer pageNo;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("RequestId")
    private String requestId;

    @Query
    @NameInMap("SellerId")
    private Long sellerId;

    @Query
    @NameInMap("TemplateId")
    private Long templateId;

    @Query
    @NameInMap("Uids")
    private java.util.List < Long > uids;

    private GetCouponPageRequest(Builder builder) {
        super(builder);
        this.fromApp = builder.fromApp;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.sellerId = builder.sellerId;
        this.templateId = builder.templateId;
        this.uids = builder.uids;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCouponPageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fromApp
     */
    public String getFromApp() {
        return this.fromApp;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sellerId
     */
    public Long getSellerId() {
        return this.sellerId;
    }

    /**
     * @return templateId
     */
    public Long getTemplateId() {
        return this.templateId;
    }

    /**
     * @return uids
     */
    public java.util.List < Long > getUids() {
        return this.uids;
    }

    public static final class Builder extends Request.Builder<GetCouponPageRequest, Builder> {
        private String fromApp; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String requestId; 
        private Long sellerId; 
        private Long templateId; 
        private java.util.List < Long > uids; 

        private Builder() {
            super();
        } 

        private Builder(GetCouponPageRequest request) {
            super(request);
            this.fromApp = request.fromApp;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.requestId = request.requestId;
            this.sellerId = request.sellerId;
            this.templateId = request.templateId;
            this.uids = request.uids;
        } 

        /**
         * FromApp.
         */
        public Builder fromApp(String fromApp) {
            this.putQueryParameter("FromApp", fromApp);
            this.fromApp = fromApp;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.putQueryParameter("RequestId", requestId);
            this.requestId = requestId;
            return this;
        }

        /**
         * SellerId.
         */
        public Builder sellerId(Long sellerId) {
            this.putQueryParameter("SellerId", sellerId);
            this.sellerId = sellerId;
            return this;
        }

        /**
         * TemplateId.
         */
        public Builder templateId(Long templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * Uids.
         */
        public Builder uids(java.util.List < Long > uids) {
            this.putQueryParameter("Uids", uids);
            this.uids = uids;
            return this;
        }

        @Override
        public GetCouponPageRequest build() {
            return new GetCouponPageRequest(this);
        } 

    } 

}

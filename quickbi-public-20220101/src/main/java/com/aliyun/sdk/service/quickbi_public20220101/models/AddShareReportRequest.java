// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddShareReportRequest} extends {@link RequestModel}
 *
 * <p>AddShareReportRequest</p>
 */
public class AddShareReportRequest extends Request {
    @Query
    @NameInMap("AuthPoint")
    @Validation(required = true, maximum = 3, minimum = 1)
    private Integer authPoint;

    @Query
    @NameInMap("ExpireDate")
    @Validation(required = true, maximum = 33167973431000D)
    private Long expireDate;

    @Query
    @NameInMap("ShareToId")
    @Validation(required = true)
    private String shareToId;

    @Query
    @NameInMap("ShareToType")
    @Validation(required = true, maximum = 2)
    private Integer shareToType;

    @Query
    @NameInMap("WorksId")
    @Validation(required = true)
    private String worksId;

    private AddShareReportRequest(Builder builder) {
        super(builder);
        this.authPoint = builder.authPoint;
        this.expireDate = builder.expireDate;
        this.shareToId = builder.shareToId;
        this.shareToType = builder.shareToType;
        this.worksId = builder.worksId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddShareReportRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authPoint
     */
    public Integer getAuthPoint() {
        return this.authPoint;
    }

    /**
     * @return expireDate
     */
    public Long getExpireDate() {
        return this.expireDate;
    }

    /**
     * @return shareToId
     */
    public String getShareToId() {
        return this.shareToId;
    }

    /**
     * @return shareToType
     */
    public Integer getShareToType() {
        return this.shareToType;
    }

    /**
     * @return worksId
     */
    public String getWorksId() {
        return this.worksId;
    }

    public static final class Builder extends Request.Builder<AddShareReportRequest, Builder> {
        private Integer authPoint; 
        private Long expireDate; 
        private String shareToId; 
        private Integer shareToType; 
        private String worksId; 

        private Builder() {
            super();
        } 

        private Builder(AddShareReportRequest request) {
            super(request);
            this.authPoint = request.authPoint;
            this.expireDate = request.expireDate;
            this.shareToId = request.shareToId;
            this.shareToType = request.shareToType;
            this.worksId = request.worksId;
        } 

        /**
         * AuthPoint.
         */
        public Builder authPoint(Integer authPoint) {
            this.putQueryParameter("AuthPoint", authPoint);
            this.authPoint = authPoint;
            return this;
        }

        /**
         * ExpireDate.
         */
        public Builder expireDate(Long expireDate) {
            this.putQueryParameter("ExpireDate", expireDate);
            this.expireDate = expireDate;
            return this;
        }

        /**
         * ShareToId.
         */
        public Builder shareToId(String shareToId) {
            this.putQueryParameter("ShareToId", shareToId);
            this.shareToId = shareToId;
            return this;
        }

        /**
         * ShareToType.
         */
        public Builder shareToType(Integer shareToType) {
            this.putQueryParameter("ShareToType", shareToType);
            this.shareToType = shareToType;
            return this;
        }

        /**
         * WorksId.
         */
        public Builder worksId(String worksId) {
            this.putQueryParameter("WorksId", worksId);
            this.worksId = worksId;
            return this;
        }

        @Override
        public AddShareReportRequest build() {
            return new AddShareReportRequest(this);
        } 

    } 

}

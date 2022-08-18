// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PreviewGtmRecoveryPlanRequest} extends {@link RequestModel}
 *
 * <p>PreviewGtmRecoveryPlanRequest</p>
 */
public class PreviewGtmRecoveryPlanRequest extends Request {
    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("RecoveryPlanId")
    @Validation(required = true)
    private Long recoveryPlanId;

    private PreviewGtmRecoveryPlanRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.recoveryPlanId = builder.recoveryPlanId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PreviewGtmRecoveryPlanRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
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
     * @return recoveryPlanId
     */
    public Long getRecoveryPlanId() {
        return this.recoveryPlanId;
    }

    public static final class Builder extends Request.Builder<PreviewGtmRecoveryPlanRequest, Builder> {
        private String lang; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Long recoveryPlanId; 

        private Builder() {
            super();
        } 

        private Builder(PreviewGtmRecoveryPlanRequest request) {
            super(request);
            this.lang = request.lang;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.recoveryPlanId = request.recoveryPlanId;
        } 

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
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

        /**
         * RecoveryPlanId.
         */
        public Builder recoveryPlanId(Long recoveryPlanId) {
            this.putQueryParameter("RecoveryPlanId", recoveryPlanId);
            this.recoveryPlanId = recoveryPlanId;
            return this;
        }

        @Override
        public PreviewGtmRecoveryPlanRequest build() {
            return new PreviewGtmRecoveryPlanRequest(this);
        } 

    } 

}

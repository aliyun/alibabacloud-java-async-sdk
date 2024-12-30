// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AddShareReportRequest} extends {@link RequestModel}
 *
 * <p>AddShareReportRequest</p>
 */
public class AddShareReportRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthPoint")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 3, minimum = 1)
    private Integer authPoint;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExpireDate")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long expireDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShareToId")
    private String shareToId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShareToType")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 2)
    private Integer shareToType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorksId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The scope of authorization. Valid values:</p>
         * <ul>
         * <li>1: view only</li>
         * <li>3: View and export</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder authPoint(Integer authPoint) {
            this.putQueryParameter("AuthPoint", authPoint);
            this.authPoint = authPoint;
            return this;
        }

        /**
         * <p>The validity period of the share. The value is a timestamp in milliseconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1608202110838</p>
         */
        public Builder expireDate(Long expireDate) {
            this.putQueryParameter("ExpireDate", expireDate);
            this.expireDate = expireDate;
            return this;
        }

        /**
         * <p>The ID of the person to be shared, which may be the user ID of the Quick BI or the user group ID.</p>
         * <ul>
         * <li>If ShareToType is 0 (user), ShareTo is the user ID.</li>
         * <li>When ShareToType is set to 1 (user group), ShareTo is the user group ID.</li>
         * <li>When ShareToType=2 (organization), ShareTo is the ID of the organization.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>de4bc5f9429141cc8091cdd1c15b****</p>
         */
        public Builder shareToId(String shareToId) {
            this.putQueryParameter("ShareToId", shareToId);
            this.shareToId = shareToId;
            return this;
        }

        /**
         * <p>The share type of the template. Valid values:</p>
         * <ul>
         * <li>0: user</li>
         * <li>1: user group</li>
         * <li>2: organization</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder shareToType(Integer shareToType) {
            this.putQueryParameter("ShareToType", shareToType);
            this.shareToType = shareToType;
            return this;
        }

        /**
         * <p>The ID of the shared work. The works here include BI portal, dashboards, spreadsheets, and self-service access.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>6b407e50-e774-406b-9956-da2425c2****</p>
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

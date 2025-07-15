// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link DescribeLiveAISubtitleRequest} extends {@link RequestModel}
 *
 * <p>DescribeLiveAISubtitleRequest</p>
 */
public class DescribeLiveAISubtitleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsDefault")
    private Boolean isDefault;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private String pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubtitleId")
    private String subtitleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubtitleName")
    private String subtitleName;

    private DescribeLiveAISubtitleRequest(Builder builder) {
        super(builder);
        this.isDefault = builder.isDefault;
        this.ownerId = builder.ownerId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.subtitleId = builder.subtitleId;
        this.subtitleName = builder.subtitleName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveAISubtitleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return isDefault
     */
    public Boolean getIsDefault() {
        return this.isDefault;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return pageNumber
     */
    public String getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return subtitleId
     */
    public String getSubtitleId() {
        return this.subtitleId;
    }

    /**
     * @return subtitleName
     */
    public String getSubtitleName() {
        return this.subtitleName;
    }

    public static final class Builder extends Request.Builder<DescribeLiveAISubtitleRequest, Builder> {
        private Boolean isDefault; 
        private Long ownerId; 
        private String pageNumber; 
        private String pageSize; 
        private String regionId; 
        private String subtitleId; 
        private String subtitleName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeLiveAISubtitleRequest request) {
            super(request);
            this.isDefault = request.isDefault;
            this.ownerId = request.ownerId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.subtitleId = request.subtitleId;
            this.subtitleName = request.subtitleName;
        } 

        /**
         * <p>Specifies whether to query the default subtitle template. Valid values:</p>
         * <ul>
         * <li><p>true</p>
         * </li>
         * <li><p>false</p>
         * <p>**</p>
         * <p>**Note **The default template includes the built-in parameter configurations. You can specify the copyFrom parameter when you call the AddLiveAISubtitle operation to use the default template.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder isDefault(Boolean isDefault) {
            this.putQueryParameter("IsDefault", isDefault);
            this.isDefault = isDefault;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The page number. Valid values: [1,100].</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(String pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values: [1,100].</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the subtitle template.</p>
         * 
         * <strong>example:</strong>
         * <p>445409ec-7eaa-461d-8f29-4bec2eb9****</p>
         */
        public Builder subtitleId(String subtitleId) {
            this.putQueryParameter("SubtitleId", subtitleId);
            this.subtitleId = subtitleId;
            return this;
        }

        /**
         * <p>The name of the subtitle template. The name can contain only digits, letters, and hyphens (-). The name cannot start with a hyphen.</p>
         * 
         * <strong>example:</strong>
         * <p>sub01</p>
         */
        public Builder subtitleName(String subtitleName) {
            this.putQueryParameter("SubtitleName", subtitleName);
            this.subtitleName = subtitleName;
            return this;
        }

        @Override
        public DescribeLiveAISubtitleRequest build() {
            return new DescribeLiveAISubtitleRequest(this);
        } 

    } 

}

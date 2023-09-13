// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSmartSysAvatarModelsRequest} extends {@link RequestModel}
 *
 * <p>ListSmartSysAvatarModelsRequest</p>
 */
public class ListSmartSysAvatarModelsRequest extends Request {
    @Query
    @NameInMap("PageNo")
    private Long pageNo;

    @Query
    @NameInMap("PageSize")
    private Long pageSize;

    @Query
    @NameInMap("SdkVersion")
    private String sdkVersion;

    private ListSmartSysAvatarModelsRequest(Builder builder) {
        super(builder);
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.sdkVersion = builder.sdkVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSmartSysAvatarModelsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pageNo
     */
    public Long getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return sdkVersion
     */
    public String getSdkVersion() {
        return this.sdkVersion;
    }

    public static final class Builder extends Request.Builder<ListSmartSysAvatarModelsRequest, Builder> {
        private Long pageNo; 
        private Long pageSize; 
        private String sdkVersion; 

        private Builder() {
            super();
        } 

        private Builder(ListSmartSysAvatarModelsRequest request) {
            super(request);
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.sdkVersion = request.sdkVersion;
        } 

        /**
         * PageNo.
         */
        public Builder pageNo(Long pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * SdkVersion.
         */
        public Builder sdkVersion(String sdkVersion) {
            this.putQueryParameter("SdkVersion", sdkVersion);
            this.sdkVersion = sdkVersion;
            return this;
        }

        @Override
        public ListSmartSysAvatarModelsRequest build() {
            return new ListSmartSysAvatarModelsRequest(this);
        } 

    } 

}

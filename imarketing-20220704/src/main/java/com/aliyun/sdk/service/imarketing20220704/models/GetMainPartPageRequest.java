// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imarketing20220704.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMainPartPageRequest} extends {@link RequestModel}
 *
 * <p>GetMainPartPageRequest</p>
 */
public class GetMainPartPageRequest extends Request {
    @Query
    @NameInMap("MainId")
    @Validation(minimum = 1)
    private Long mainId;

    @Query
    @NameInMap("MainName")
    private String mainName;

    @Query
    @NameInMap("PageIndex")
    @Validation(required = true, maximum = 99999)
    private Integer pageIndex;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true, maximum = 10000, minimum = 1)
    private Integer pageSize;

    private GetMainPartPageRequest(Builder builder) {
        super(builder);
        this.mainId = builder.mainId;
        this.mainName = builder.mainName;
        this.pageIndex = builder.pageIndex;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMainPartPageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return mainId
     */
    public Long getMainId() {
        return this.mainId;
    }

    /**
     * @return mainName
     */
    public String getMainName() {
        return this.mainName;
    }

    /**
     * @return pageIndex
     */
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<GetMainPartPageRequest, Builder> {
        private Long mainId; 
        private String mainName; 
        private Integer pageIndex; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(GetMainPartPageRequest request) {
            super(request);
            this.mainId = request.mainId;
            this.mainName = request.mainName;
            this.pageIndex = request.pageIndex;
            this.pageSize = request.pageSize;
        } 

        /**
         * MainId.
         */
        public Builder mainId(Long mainId) {
            this.putQueryParameter("MainId", mainId);
            this.mainId = mainId;
            return this;
        }

        /**
         * MainName.
         */
        public Builder mainName(String mainName) {
            this.putQueryParameter("MainName", mainName);
            this.mainName = mainName;
            return this;
        }

        /**
         * PageIndex.
         */
        public Builder pageIndex(Integer pageIndex) {
            this.putQueryParameter("PageIndex", pageIndex);
            this.pageIndex = pageIndex;
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

        @Override
        public GetMainPartPageRequest build() {
            return new GetMainPartPageRequest(this);
        } 

    } 

}

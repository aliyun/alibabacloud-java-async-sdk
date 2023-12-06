// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProductInstancesRequest} extends {@link RequestModel}
 *
 * <p>ListProductInstancesRequest</p>
 */
public class ListProductInstancesRequest extends Request {
    @Query
    @NameInMap("envUID")
    private String envUID;

    @Query
    @NameInMap("options")
    private Options options;

    @Query
    @NameInMap("pageNum")
    private Integer pageNum;

    @Query
    @NameInMap("pageSize")
    private Integer pageSize;

    @Query
    @NameInMap("productVersionUID")
    private String productVersionUID;

    private ListProductInstancesRequest(Builder builder) {
        super(builder);
        this.envUID = builder.envUID;
        this.options = builder.options;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.productVersionUID = builder.productVersionUID;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProductInstancesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return envUID
     */
    public String getEnvUID() {
        return this.envUID;
    }

    /**
     * @return options
     */
    public Options getOptions() {
        return this.options;
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
     * @return productVersionUID
     */
    public String getProductVersionUID() {
        return this.productVersionUID;
    }

    public static final class Builder extends Request.Builder<ListProductInstancesRequest, Builder> {
        private String envUID; 
        private Options options; 
        private Integer pageNum; 
        private Integer pageSize; 
        private String productVersionUID; 

        private Builder() {
            super();
        } 

        private Builder(ListProductInstancesRequest request) {
            super(request);
            this.envUID = request.envUID;
            this.options = request.options;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.productVersionUID = request.productVersionUID;
        } 

        /**
         * envUID.
         */
        public Builder envUID(String envUID) {
            this.putQueryParameter("envUID", envUID);
            this.envUID = envUID;
            return this;
        }

        /**
         * options.
         */
        public Builder options(Options options) {
            String optionsShrink = shrink(options, "options", "json");
            this.putQueryParameter("options", optionsShrink);
            this.options = options;
            return this;
        }

        /**
         * pageNum.
         */
        public Builder pageNum(Integer pageNum) {
            this.putQueryParameter("pageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * productVersionUID.
         */
        public Builder productVersionUID(String productVersionUID) {
            this.putQueryParameter("productVersionUID", productVersionUID);
            this.productVersionUID = productVersionUID;
            return this;
        }

        @Override
        public ListProductInstancesRequest build() {
            return new ListProductInstancesRequest(this);
        } 

    } 

    public static class Options extends TeaModel {
        @NameInMap("filterWithSpecUID")
        private Boolean filterWithSpecUID;

        @NameInMap("specUID")
        private String specUID;

        private Options(Builder builder) {
            this.filterWithSpecUID = builder.filterWithSpecUID;
            this.specUID = builder.specUID;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Options create() {
            return builder().build();
        }

        /**
         * @return filterWithSpecUID
         */
        public Boolean getFilterWithSpecUID() {
            return this.filterWithSpecUID;
        }

        /**
         * @return specUID
         */
        public String getSpecUID() {
            return this.specUID;
        }

        public static final class Builder {
            private Boolean filterWithSpecUID; 
            private String specUID; 

            /**
             * filterWithSpecUID.
             */
            public Builder filterWithSpecUID(Boolean filterWithSpecUID) {
                this.filterWithSpecUID = filterWithSpecUID;
                return this;
            }

            /**
             * specUID.
             */
            public Builder specUID(String specUID) {
                this.specUID = specUID;
                return this;
            }

            public Options build() {
                return new Options(this);
            } 

        } 

    }
}

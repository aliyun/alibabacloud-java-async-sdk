// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.amqp20190901.models;

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
 * {@link ListQueueUpstreamBindingsResponseBody} extends {@link TeaModel}
 *
 * <p>ListQueueUpstreamBindingsResponseBody</p>
 */
public class ListQueueUpstreamBindingsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListQueueUpstreamBindingsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListQueueUpstreamBindingsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListQueueUpstreamBindingsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListQueueUpstreamBindingsResponseBody build() {
            return new ListQueueUpstreamBindingsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListQueueUpstreamBindingsResponseBody} extends {@link TeaModel}
     *
     * <p>ListQueueUpstreamBindingsResponseBody</p>
     */
    public static class BindingVO extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Argument")
        private String argument;

        @com.aliyun.core.annotation.NameInMap("BindingKey")
        private String bindingKey;

        @com.aliyun.core.annotation.NameInMap("BindingType")
        private Integer bindingType;

        @com.aliyun.core.annotation.NameInMap("DstName")
        private String dstName;

        @com.aliyun.core.annotation.NameInMap("SrcName")
        private String srcName;

        private BindingVO(Builder builder) {
            this.argument = builder.argument;
            this.bindingKey = builder.bindingKey;
            this.bindingType = builder.bindingType;
            this.dstName = builder.dstName;
            this.srcName = builder.srcName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BindingVO create() {
            return builder().build();
        }

        /**
         * @return argument
         */
        public String getArgument() {
            return this.argument;
        }

        /**
         * @return bindingKey
         */
        public String getBindingKey() {
            return this.bindingKey;
        }

        /**
         * @return bindingType
         */
        public Integer getBindingType() {
            return this.bindingType;
        }

        /**
         * @return dstName
         */
        public String getDstName() {
            return this.dstName;
        }

        /**
         * @return srcName
         */
        public String getSrcName() {
            return this.srcName;
        }

        public static final class Builder {
            private String argument; 
            private String bindingKey; 
            private Integer bindingType; 
            private String dstName; 
            private String srcName; 

            private Builder() {
            } 

            private Builder(BindingVO model) {
                this.argument = model.argument;
                this.bindingKey = model.bindingKey;
                this.bindingType = model.bindingType;
                this.dstName = model.dstName;
                this.srcName = model.srcName;
            } 

            /**
             * Argument.
             */
            public Builder argument(String argument) {
                this.argument = argument;
                return this;
            }

            /**
             * BindingKey.
             */
            public Builder bindingKey(String bindingKey) {
                this.bindingKey = bindingKey;
                return this;
            }

            /**
             * BindingType.
             */
            public Builder bindingType(Integer bindingType) {
                this.bindingType = bindingType;
                return this;
            }

            /**
             * DstName.
             */
            public Builder dstName(String dstName) {
                this.dstName = dstName;
                return this;
            }

            /**
             * SrcName.
             */
            public Builder srcName(String srcName) {
                this.srcName = srcName;
                return this;
            }

            public BindingVO build() {
                return new BindingVO(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListQueueUpstreamBindingsResponseBody} extends {@link TeaModel}
     *
     * <p>ListQueueUpstreamBindingsResponseBody</p>
     */
    public static class VoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BindingVO")
        private java.util.List<BindingVO> bindingVO;

        private VoList(Builder builder) {
            this.bindingVO = builder.bindingVO;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VoList create() {
            return builder().build();
        }

        /**
         * @return bindingVO
         */
        public java.util.List<BindingVO> getBindingVO() {
            return this.bindingVO;
        }

        public static final class Builder {
            private java.util.List<BindingVO> bindingVO; 

            private Builder() {
            } 

            private Builder(VoList model) {
                this.bindingVO = model.bindingVO;
            } 

            /**
             * BindingVO.
             */
            public Builder bindingVO(java.util.List<BindingVO> bindingVO) {
                this.bindingVO = bindingVO;
                return this;
            }

            public VoList build() {
                return new VoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListQueueUpstreamBindingsResponseBody} extends {@link TeaModel}
     *
     * <p>ListQueueUpstreamBindingsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("VoList")
        private VoList voList;

        private Data(Builder builder) {
            this.currentPage = builder.currentPage;
            this.pageSize = builder.pageSize;
            this.voList = builder.voList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return voList
         */
        public VoList getVoList() {
            return this.voList;
        }

        public static final class Builder {
            private Integer currentPage; 
            private Integer pageSize; 
            private VoList voList; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.currentPage = model.currentPage;
                this.pageSize = model.pageSize;
                this.voList = model.voList;
            } 

            /**
             * CurrentPage.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * VoList.
             */
            public Builder voList(VoList voList) {
                this.voList = voList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}

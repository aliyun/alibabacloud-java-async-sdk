// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliyunid_ag20180912.models;

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
 * {@link PaginateAgRelationsResponseBody} extends {@link TeaModel}
 *
 * <p>PaginateAgRelationsResponseBody</p>
 */
public class PaginateAgRelationsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AgRelationDtos")
    private AgRelationDtos agRelationDtos;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Long pageNo;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private PaginateAgRelationsResponseBody(Builder builder) {
        this.agRelationDtos = builder.agRelationDtos;
        this.code = builder.code;
        this.message = builder.message;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PaginateAgRelationsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agRelationDtos
     */
    public AgRelationDtos getAgRelationDtos() {
        return this.agRelationDtos;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private AgRelationDtos agRelationDtos; 
        private String code; 
        private String message; 
        private Long pageNo; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(PaginateAgRelationsResponseBody model) {
            this.agRelationDtos = model.agRelationDtos;
            this.code = model.code;
            this.message = model.message;
            this.pageNo = model.pageNo;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalCount = model.totalCount;
        } 

        /**
         * AgRelationDtos.
         */
        public Builder agRelationDtos(AgRelationDtos agRelationDtos) {
            this.agRelationDtos = agRelationDtos;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
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
         * PageNo.
         */
        public Builder pageNo(Long pageNo) {
            this.pageNo = pageNo;
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

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public PaginateAgRelationsResponseBody build() {
            return new PaginateAgRelationsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link PaginateAgRelationsResponseBody} extends {@link TeaModel}
     *
     * <p>PaginateAgRelationsResponseBody</p>
     */
    public static class AgRelationDto extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Mpk")
        private String mpk;

        @com.aliyun.core.annotation.NameInMap("Pk")
        private String pk;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private AgRelationDto(Builder builder) {
            this.mpk = builder.mpk;
            this.pk = builder.pk;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AgRelationDto create() {
            return builder().build();
        }

        /**
         * @return mpk
         */
        public String getMpk() {
            return this.mpk;
        }

        /**
         * @return pk
         */
        public String getPk() {
            return this.pk;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String mpk; 
            private String pk; 
            private String type; 

            private Builder() {
            } 

            private Builder(AgRelationDto model) {
                this.mpk = model.mpk;
                this.pk = model.pk;
                this.type = model.type;
            } 

            /**
             * Mpk.
             */
            public Builder mpk(String mpk) {
                this.mpk = mpk;
                return this;
            }

            /**
             * Pk.
             */
            public Builder pk(String pk) {
                this.pk = pk;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public AgRelationDto build() {
                return new AgRelationDto(this);
            } 

        } 

    }
    /**
     * 
     * {@link PaginateAgRelationsResponseBody} extends {@link TeaModel}
     *
     * <p>PaginateAgRelationsResponseBody</p>
     */
    public static class AgRelationDtos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgRelationDto")
        private java.util.List<AgRelationDto> agRelationDto;

        private AgRelationDtos(Builder builder) {
            this.agRelationDto = builder.agRelationDto;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AgRelationDtos create() {
            return builder().build();
        }

        /**
         * @return agRelationDto
         */
        public java.util.List<AgRelationDto> getAgRelationDto() {
            return this.agRelationDto;
        }

        public static final class Builder {
            private java.util.List<AgRelationDto> agRelationDto; 

            private Builder() {
            } 

            private Builder(AgRelationDtos model) {
                this.agRelationDto = model.agRelationDto;
            } 

            /**
             * AgRelationDto.
             */
            public Builder agRelationDto(java.util.List<AgRelationDto> agRelationDto) {
                this.agRelationDto = agRelationDto;
                return this;
            }

            public AgRelationDtos build() {
                return new AgRelationDtos(this);
            } 

        } 

    }
}

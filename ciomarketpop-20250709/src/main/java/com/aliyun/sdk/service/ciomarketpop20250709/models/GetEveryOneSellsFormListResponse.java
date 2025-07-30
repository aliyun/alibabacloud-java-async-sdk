// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ciomarketpop20250709.models;

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
 * {@link GetEveryOneSellsFormListResponse} extends {@link TeaModel}
 *
 * <p>GetEveryOneSellsFormListResponse</p>
 */
public class GetEveryOneSellsFormListResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private java.util.List<GetEveryOneSellsFormListResponseBody> body;

    private GetEveryOneSellsFormListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetEveryOneSellsFormListResponse create() {
        return new BuilderImpl().build();
    }

@Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    /**
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * @return body
     */
    public java.util.List<GetEveryOneSellsFormListResponseBody> getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetEveryOneSellsFormListResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(java.util.List<GetEveryOneSellsFormListResponseBody> body);

        @Override
        GetEveryOneSellsFormListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetEveryOneSellsFormListResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private java.util.List<GetEveryOneSellsFormListResponseBody> body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetEveryOneSellsFormListResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map<String, String> headers) {
            this.headers = headers;
            return this;
        }

        /**
         * statusCode.
         */
        @Override
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(java.util.List<GetEveryOneSellsFormListResponseBody> body) {
            this.body = body;
            return this;
        }

        @Override
        public GetEveryOneSellsFormListResponse build() {
            return new GetEveryOneSellsFormListResponse(this);
        } 

    } 

    /**
     * 
     * {@link GetEveryOneSellsFormListResponse} extends {@link TeaModel}
     *
     * <p>GetEveryOneSellsFormListResponse</p>
     */
    public static class GetEveryOneSellsFormListResponseBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("VirtualMainDepartment")
        private String virtualMainDepartment;

        @com.aliyun.core.annotation.NameInMap("VirtualDepartmentName")
        private String virtualDepartmentName;

        @com.aliyun.core.annotation.NameInMap("VirtualDepartmentCode")
        private String virtualDepartmentCode;

        @com.aliyun.core.annotation.NameInMap("VirtualParentDepartment")
        private String virtualParentDepartment;

        @com.aliyun.core.annotation.NameInMap("VirtualDepartmentStatus")
        private String virtualDepartmentStatus;

        @com.aliyun.core.annotation.NameInMap("DingId")
        private String dingId;

        @com.aliyun.core.annotation.NameInMap("EmpStatus")
        private String empStatus;

        private GetEveryOneSellsFormListResponseBody(Builder builder) {
            this.id = builder.id;
            this.virtualMainDepartment = builder.virtualMainDepartment;
            this.virtualDepartmentName = builder.virtualDepartmentName;
            this.virtualDepartmentCode = builder.virtualDepartmentCode;
            this.virtualParentDepartment = builder.virtualParentDepartment;
            this.virtualDepartmentStatus = builder.virtualDepartmentStatus;
            this.dingId = builder.dingId;
            this.empStatus = builder.empStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GetEveryOneSellsFormListResponseBody create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return virtualMainDepartment
         */
        public String getVirtualMainDepartment() {
            return this.virtualMainDepartment;
        }

        /**
         * @return virtualDepartmentName
         */
        public String getVirtualDepartmentName() {
            return this.virtualDepartmentName;
        }

        /**
         * @return virtualDepartmentCode
         */
        public String getVirtualDepartmentCode() {
            return this.virtualDepartmentCode;
        }

        /**
         * @return virtualParentDepartment
         */
        public String getVirtualParentDepartment() {
            return this.virtualParentDepartment;
        }

        /**
         * @return virtualDepartmentStatus
         */
        public String getVirtualDepartmentStatus() {
            return this.virtualDepartmentStatus;
        }

        /**
         * @return dingId
         */
        public String getDingId() {
            return this.dingId;
        }

        /**
         * @return empStatus
         */
        public String getEmpStatus() {
            return this.empStatus;
        }

        public static final class Builder {
            private Long id; 
            private String virtualMainDepartment; 
            private String virtualDepartmentName; 
            private String virtualDepartmentCode; 
            private String virtualParentDepartment; 
            private String virtualDepartmentStatus; 
            private String dingId; 
            private String empStatus; 

            private Builder() {
            } 

            private Builder(GetEveryOneSellsFormListResponseBody model) {
                this.id = model.id;
                this.virtualMainDepartment = model.virtualMainDepartment;
                this.virtualDepartmentName = model.virtualDepartmentName;
                this.virtualDepartmentCode = model.virtualDepartmentCode;
                this.virtualParentDepartment = model.virtualParentDepartment;
                this.virtualDepartmentStatus = model.virtualDepartmentStatus;
                this.dingId = model.dingId;
                this.empStatus = model.empStatus;
            } 

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * VirtualMainDepartment.
             */
            public Builder virtualMainDepartment(String virtualMainDepartment) {
                this.virtualMainDepartment = virtualMainDepartment;
                return this;
            }

            /**
             * VirtualDepartmentName.
             */
            public Builder virtualDepartmentName(String virtualDepartmentName) {
                this.virtualDepartmentName = virtualDepartmentName;
                return this;
            }

            /**
             * VirtualDepartmentCode.
             */
            public Builder virtualDepartmentCode(String virtualDepartmentCode) {
                this.virtualDepartmentCode = virtualDepartmentCode;
                return this;
            }

            /**
             * VirtualParentDepartment.
             */
            public Builder virtualParentDepartment(String virtualParentDepartment) {
                this.virtualParentDepartment = virtualParentDepartment;
                return this;
            }

            /**
             * VirtualDepartmentStatus.
             */
            public Builder virtualDepartmentStatus(String virtualDepartmentStatus) {
                this.virtualDepartmentStatus = virtualDepartmentStatus;
                return this;
            }

            /**
             * DingId.
             */
            public Builder dingId(String dingId) {
                this.dingId = dingId;
                return this;
            }

            /**
             * EmpStatus.
             */
            public Builder empStatus(String empStatus) {
                this.empStatus = empStatus;
                return this;
            }

            public GetEveryOneSellsFormListResponseBody build() {
                return new GetEveryOneSellsFormListResponseBody(this);
            } 

        } 

    }
}

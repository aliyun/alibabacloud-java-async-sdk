// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSingleConnDataResponseBody} extends {@link TeaModel}
 *
 * <p>GetSingleConnDataResponseBody</p>
 */
public class GetSingleConnDataResponseBody extends TeaModel {
    @NameInMap("Code")
    private Long code;

    @NameInMap("List")
    private java.util.List < List> list;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("Version")
    private String version;

    private GetSingleConnDataResponseBody(Builder builder) {
        this.code = builder.code;
        this.list = builder.list;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSingleConnDataResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Long getCode() {
        return this.code;
    }

    /**
     * @return list
     */
    public java.util.List < List> getList() {
        return this.list;
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

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder {
        private Long code; 
        private java.util.List < List> list; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private String version; 

        /**
         * 返回码
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * 关联信息
         */
        public Builder list(java.util.List < List> list) {
            this.list = list;
            return this;
        }

        /**
         * 错误消息
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * 请求ID，与入参requestId对应
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 是否请求成功
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * 版本
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        public GetSingleConnDataResponseBody build() {
            return new GetSingleConnDataResponseBody(this);
        } 

    } 

    public static class List extends TeaModel {
        @NameInMap("Id")
        private String id;

        @NameInMap("MapId")
        private String mapId;

        @NameInMap("Type")
        private String type;

        private List(Builder builder) {
            this.id = builder.id;
            this.mapId = builder.mapId;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return mapId
         */
        public String getMapId() {
            return this.mapId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String id; 
            private String mapId; 
            private String type; 

            /**
             * ID
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * 关联ID
             */
            public Builder mapId(String mapId) {
                this.mapId = mapId;
                return this;
            }

            /**
             * outer:外关联 inner：内关联 stair：楼梯关联
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
}

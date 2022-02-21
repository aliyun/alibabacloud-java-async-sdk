// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdc20180821.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchProjectsByRegionResponseBody} extends {@link TeaModel}
 *
 * <p>SearchProjectsByRegionResponseBody</p>
 */
public class SearchProjectsByRegionResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private SearchProjectsByRegionResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchProjectsByRegionResponseBody create() {
        return builder().build();
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
    public java.util.List < Data> getData() {
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
        private java.util.List < Data> data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

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
        public Builder data(java.util.List < Data> data) {
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

        public SearchProjectsByRegionResponseBody build() {
            return new SearchProjectsByRegionResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("AoneId")
        private Integer aoneId;

        @NameInMap("AoneType")
        private String aoneType;

        @NameInMap("CustomFieldMap")
        private java.util.List < String > customFieldMap;

        @NameInMap("Description")
        private String description;

        @NameInMap("FullName")
        private String fullName;

        @NameInMap("Icons")
        private java.util.List < String > icons;

        @NameInMap("Id")
        private Integer id;

        @NameInMap("IdPath")
        private String idPath;

        @NameInMap("Mode")
        private String mode;

        @NameInMap("Name")
        private String name;

        @NameInMap("ParentId")
        private Integer parentId;

        @NameInMap("Stamp")
        private String stamp;

        @NameInMap("Status")
        private String status;

        @NameInMap("Type")
        private String type;

        private Data(Builder builder) {
            this.aoneId = builder.aoneId;
            this.aoneType = builder.aoneType;
            this.customFieldMap = builder.customFieldMap;
            this.description = builder.description;
            this.fullName = builder.fullName;
            this.icons = builder.icons;
            this.id = builder.id;
            this.idPath = builder.idPath;
            this.mode = builder.mode;
            this.name = builder.name;
            this.parentId = builder.parentId;
            this.stamp = builder.stamp;
            this.status = builder.status;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return aoneId
         */
        public Integer getAoneId() {
            return this.aoneId;
        }

        /**
         * @return aoneType
         */
        public String getAoneType() {
            return this.aoneType;
        }

        /**
         * @return customFieldMap
         */
        public java.util.List < String > getCustomFieldMap() {
            return this.customFieldMap;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return fullName
         */
        public String getFullName() {
            return this.fullName;
        }

        /**
         * @return icons
         */
        public java.util.List < String > getIcons() {
            return this.icons;
        }

        /**
         * @return id
         */
        public Integer getId() {
            return this.id;
        }

        /**
         * @return idPath
         */
        public String getIdPath() {
            return this.idPath;
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return parentId
         */
        public Integer getParentId() {
            return this.parentId;
        }

        /**
         * @return stamp
         */
        public String getStamp() {
            return this.stamp;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Integer aoneId; 
            private String aoneType; 
            private java.util.List < String > customFieldMap; 
            private String description; 
            private String fullName; 
            private java.util.List < String > icons; 
            private Integer id; 
            private String idPath; 
            private String mode; 
            private String name; 
            private Integer parentId; 
            private String stamp; 
            private String status; 
            private String type; 

            /**
             * AoneId.
             */
            public Builder aoneId(Integer aoneId) {
                this.aoneId = aoneId;
                return this;
            }

            /**
             * AoneType.
             */
            public Builder aoneType(String aoneType) {
                this.aoneType = aoneType;
                return this;
            }

            /**
             * CustomFieldMap.
             */
            public Builder customFieldMap(java.util.List < String > customFieldMap) {
                this.customFieldMap = customFieldMap;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * FullName.
             */
            public Builder fullName(String fullName) {
                this.fullName = fullName;
                return this;
            }

            /**
             * Icons.
             */
            public Builder icons(java.util.List < String > icons) {
                this.icons = icons;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Integer id) {
                this.id = id;
                return this;
            }

            /**
             * IdPath.
             */
            public Builder idPath(String idPath) {
                this.idPath = idPath;
                return this;
            }

            /**
             * Mode.
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * ParentId.
             */
            public Builder parentId(Integer parentId) {
                this.parentId = parentId;
                return this;
            }

            /**
             * Stamp.
             */
            public Builder stamp(String stamp) {
                this.stamp = stamp;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}

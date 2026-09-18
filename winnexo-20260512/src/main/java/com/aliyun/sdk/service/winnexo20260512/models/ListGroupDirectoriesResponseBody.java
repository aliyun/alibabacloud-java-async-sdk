// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

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
 * {@link ListGroupDirectoriesResponseBody} extends {@link TeaModel}
 *
 * <p>ListGroupDirectoriesResponseBody</p>
 */
public class ListGroupDirectoriesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("directories")
    private java.util.List<Directories> directories;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Long totalCount;

    private ListGroupDirectoriesResponseBody(Builder builder) {
        this.code = builder.code;
        this.directories = builder.directories;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListGroupDirectoriesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return directories
     */
    public java.util.List<Directories> getDirectories() {
        return this.directories;
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
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private java.util.List<Directories> directories; 
        private String message; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListGroupDirectoriesResponseBody model) {
            this.code = model.code;
            this.directories = model.directories;
            this.message = model.message;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The business status code. A value of 200 indicates success.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The query root itself and all its descendant directories, including visible referenced directories in the space. The results are not paginated.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        public Builder directories(java.util.List<Directories> directories) {
            this.directories = directories;
            return this;
        }

        /**
         * <p>The error description.</p>
         * 
         * <strong>example:</strong>
         * <p>The requested resource does not exist</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request trace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of returned directories, which equals the length of the directories array.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListGroupDirectoriesResponseBody build() {
            return new ListGroupDirectoriesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListGroupDirectoriesResponseBody} extends {@link TeaModel}
     *
     * <p>ListGroupDirectoriesResponseBody</p>
     */
    public static class Directories extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("directoryId")
        private String directoryId;

        @com.aliyun.core.annotation.NameInMap("directoryType")
        private String directoryType;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("parentDirectoryId")
        private String parentDirectoryId;

        @com.aliyun.core.annotation.NameInMap("readOnly")
        private Boolean readOnly;

        private Directories(Builder builder) {
            this.description = builder.description;
            this.directoryId = builder.directoryId;
            this.directoryType = builder.directoryType;
            this.name = builder.name;
            this.parentDirectoryId = builder.parentDirectoryId;
            this.readOnly = builder.readOnly;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Directories create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return directoryId
         */
        public String getDirectoryId() {
            return this.directoryId;
        }

        /**
         * @return directoryType
         */
        public String getDirectoryType() {
            return this.directoryType;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return parentDirectoryId
         */
        public String getParentDirectoryId() {
            return this.parentDirectoryId;
        }

        /**
         * @return readOnly
         */
        public Boolean getReadOnly() {
            return this.readOnly;
        }

        public static final class Builder {
            private String description; 
            private String directoryId; 
            private String directoryType; 
            private String name; 
            private String parentDirectoryId; 
            private Boolean readOnly; 

            private Builder() {
            } 

            private Builder(Directories model) {
                this.description = model.description;
                this.directoryId = model.directoryId;
                this.directoryType = model.directoryType;
                this.name = model.name;
                this.parentDirectoryId = model.parentDirectoryId;
                this.readOnly = model.readOnly;
            } 

            /**
             * <p>The directory description.</p>
             * 
             * <strong>example:</strong>
             * <p>Project description</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The directory ID, including the query root itself and its descendants.</p>
             * 
             * <strong>example:</strong>
             * <p>dir_example</p>
             */
            public Builder directoryId(String directoryId) {
                this.directoryId = directoryId;
                return this;
            }

            /**
             * <p>The original directory type. The value is GROUP for physical directories in the space. Referenced directories retain their original type.</p>
             * 
             * <strong>example:</strong>
             * <p>GROUP</p>
             */
            public Builder directoryType(String directoryType) {
                this.directoryType = directoryType;
                return this;
            }

            /**
             * <p>The directory name.</p>
             * 
             * <strong>example:</strong>
             * <p>Project resources</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The parent directory ID. This value is empty for the internal root of the space.</p>
             * 
             * <strong>example:</strong>
             * <p>dir_parent</p>
             */
            public Builder parentDirectoryId(String parentDirectoryId) {
                this.parentDirectoryId = parentDirectoryId;
                return this;
            }

            /**
             * <p>Indicates whether the directory is a read-only referenced directory. A value of false still requires creator or administrator permissions to modify the directory. The internal root is always unmodifiable.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder readOnly(Boolean readOnly) {
                this.readOnly = readOnly;
                return this;
            }

            public Directories build() {
                return new Directories(this);
            } 

        } 

    }
}

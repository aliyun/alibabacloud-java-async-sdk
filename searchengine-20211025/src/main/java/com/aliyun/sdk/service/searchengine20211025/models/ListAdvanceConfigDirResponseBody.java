// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAdvanceConfigDirResponseBody} extends {@link TeaModel}
 *
 * <p>ListAdvanceConfigDirResponseBody</p>
 */
public class ListAdvanceConfigDirResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private java.util.List < Result> result;

    private ListAdvanceConfigDirResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAdvanceConfigDirResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public java.util.List < Result> getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Result> result; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The advanced configuration files.
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        public ListAdvanceConfigDirResponseBody build() {
            return new ListAdvanceConfigDirResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("fullPathName")
        private String fullPathName;

        @com.aliyun.core.annotation.NameInMap("isDir")
        private Boolean isDir;

        @com.aliyun.core.annotation.NameInMap("isTemplate")
        private Boolean isTemplate;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        private Result(Builder builder) {
            this.fullPathName = builder.fullPathName;
            this.isDir = builder.isDir;
            this.isTemplate = builder.isTemplate;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return fullPathName
         */
        public String getFullPathName() {
            return this.fullPathName;
        }

        /**
         * @return isDir
         */
        public Boolean getIsDir() {
            return this.isDir;
        }

        /**
         * @return isTemplate
         */
        public Boolean getIsTemplate() {
            return this.isTemplate;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String fullPathName; 
            private Boolean isDir; 
            private Boolean isTemplate; 
            private String name; 

            /**
             * The absolute path in which the file is stored.
             */
            public Builder fullPathName(String fullPathName) {
                this.fullPathName = fullPathName;
                return this;
            }

            /**
             * Indicates whether the file is a directory. Valid values: true and false.
             */
            public Builder isDir(Boolean isDir) {
                this.isDir = isDir;
                return this;
            }

            /**
             * Indicates whether the file is a template. Valid values: **true** and **false**.
             */
            public Builder isTemplate(Boolean isTemplate) {
                this.isTemplate = isTemplate;
                return this;
            }

            /**
             * The cluster name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}

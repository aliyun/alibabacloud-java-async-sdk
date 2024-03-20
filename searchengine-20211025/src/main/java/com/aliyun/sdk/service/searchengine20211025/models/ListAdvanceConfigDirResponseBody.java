// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAdvanceConfigDirResponseBody} extends {@link TeaModel}
 *
 * <p>ListAdvanceConfigDirResponseBody</p>
 */
public class ListAdvanceConfigDirResponseBody extends TeaModel {
    @NameInMap("requestId")
    private String requestId;

    @NameInMap("result")
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
         * The file list in the advanced configuration directory.
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
        @NameInMap("fullPathName")
        private String fullPathName;

        @NameInMap("isDir")
        private Boolean isDir;

        @NameInMap("isTemplate")
        private Boolean isTemplate;

        @NameInMap("name")
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
             * The name of the absolute path.
             */
            public Builder fullPathName(String fullPathName) {
                this.fullPathName = fullPathName;
                return this;
            }

            /**
             * Indicates whether it is a directory. Valid values: true and false. true indicates that it is a directory, and false indicates that it is not a directory.
             */
            public Builder isDir(Boolean isDir) {
                this.isDir = isDir;
                return this;
            }

            /**
             * Indicates whether it is a template. Valid values: **true** and **false**. true indicates that it is a template, and false indicates that it is not a template.
             */
            public Builder isTemplate(Boolean isTemplate) {
                this.isTemplate = isTemplate;
                return this;
            }

            /**
             * The name of the cluster.
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

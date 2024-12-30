// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

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
 * {@link ListMyGroupDriveResponseBody} extends {@link TeaModel}
 *
 * <p>ListMyGroupDriveResponseBody</p>
 */
public class ListMyGroupDriveResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("items")
    private java.util.List<Drive> items;

    @com.aliyun.core.annotation.NameInMap("next_marker")
    private String nextMarker;

    @com.aliyun.core.annotation.NameInMap("root_group_drive")
    private Drive rootGroupDrive;

    private ListMyGroupDriveResponseBody(Builder builder) {
        this.items = builder.items;
        this.nextMarker = builder.nextMarker;
        this.rootGroupDrive = builder.rootGroupDrive;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMyGroupDriveResponseBody create() {
        return builder().build();
    }

    /**
     * @return items
     */
    public java.util.List<Drive> getItems() {
        return this.items;
    }

    /**
     * @return nextMarker
     */
    public String getNextMarker() {
        return this.nextMarker;
    }

    /**
     * @return rootGroupDrive
     */
    public Drive getRootGroupDrive() {
        return this.rootGroupDrive;
    }

    public static final class Builder {
        private java.util.List<Drive> items; 
        private String nextMarker; 
        private Drive rootGroupDrive; 

        /**
         * <p>The information about the team drives.</p>
         */
        public Builder items(java.util.List<Drive> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results. If next_marker is empty, no next page exists.</p>
         * 
         * <strong>example:</strong>
         * <p>NWQ1Yjk4YmI1ZDRlYmU1Y2E0YWE0NmJhYWJmODBhNDQ2NzhlMTRhMg</p>
         */
        public Builder nextMarker(String nextMarker) {
            this.nextMarker = nextMarker;
            return this;
        }

        /**
         * root_group_drive.
         */
        public Builder rootGroupDrive(Drive rootGroupDrive) {
            this.rootGroupDrive = rootGroupDrive;
            return this;
        }

        public ListMyGroupDriveResponseBody build() {
            return new ListMyGroupDriveResponseBody(this);
        } 

    } 

}
